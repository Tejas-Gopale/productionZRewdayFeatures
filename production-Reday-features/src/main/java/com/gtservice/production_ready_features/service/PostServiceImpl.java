package com.gtservice.production_ready_features.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.gtservice.production_ready_features.dto.PostDto;
import com.gtservice.production_ready_features.entity.PostEntity;
import com.gtservice.production_ready_features.repository.PostRepository;

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
	
	
}
