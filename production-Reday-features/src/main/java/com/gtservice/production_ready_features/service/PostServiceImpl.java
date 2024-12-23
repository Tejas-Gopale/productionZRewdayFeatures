package com.gtservice.production_ready_features.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtservice.production_ready_features.dto.PostDto;
import com.gtservice.production_ready_features.entity.PostEntity;
import com.gtservice.production_ready_features.exceptions.ResourceNotFoundException;
import com.gtservice.production_ready_features.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<PostDto> getAllPost() {
		
		return postRepository
				.findAll() 
				.stream()
				.map(PostEntity ->modelMapper.map(PostEntity, PostDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public PostDto createNewPost(PostDto inputPost) {
		
			
			PostEntity postEntity = modelMapper.map(inputPost, PostEntity.class);
		
		return	modelMapper.map(postRepository.save(postEntity) , PostDto.class);
				
	}

	@Override
	public PostDto getPostById(@Valid Long postId) {
		
		PostEntity postEntity = postRepository
				.findById(postId)
				.orElseThrow(() ->new  ResourceNotFoundException("There is no Id Presend with the Id" + postId));
			
		return modelMapper.map(postEntity, PostDto.class);
	}

	@Override
	public PostDto updatePostById(PostDto updatedPost, Long postId) {
	
		PostEntity olderPost = postRepository
				.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("There is no post exits with the cxorresponding to this id "+ postId));
		
		updatedPost.setId(postId);
		
		modelMapper.map(updatedPost,olderPost );
		
		PostEntity savePost = 	postRepository.save(olderPost);
		
		return modelMapper.map(savePost, PostDto.class);
	}

	
	
	
}
