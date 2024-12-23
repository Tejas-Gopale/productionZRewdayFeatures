package com.gtservice.production_ready_features.service;

import java.util.List;

import javax.validation.Valid;

import com.gtservice.production_ready_features.dto.PostDto;

public interface PostService {

	List<PostDto> getAllPost();
	
	PostDto createNewPost(PostDto inputPost);

	PostDto getPostById(@Valid Long postId);



	PostDto updatePostById(PostDto updatedPost, Long postId);
}
