package com.gtservice.production_ready_features.service;

import java.util.List;

import com.gtservice.production_ready_features.dto.PostDto;

public interface PostService {

	List<PostDto> getAllPost();
	
	PostDto createNewPost(PostDto inputPost);
}
