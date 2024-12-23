package com.gtservice.production_ready_features.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtservice.production_ready_features.dto.PostDto;
import com.gtservice.production_ready_features.service.PostService;

@RestController
@RequestMapping(path = "/post")
public class PostController {

	//use the interface
	@Autowired
	private PostService postService;
	
	
	@GetMapping
	public List<PostDto>  getAllPosts(){
		return postService.getAllPost();
	}
	
	@GetMapping(path = "/{postId}")
	public PostDto getPostById(@PathVariable @Valid Long postId) {
		return   postService.getPostById(postId);
	}
	
	@PostMapping
	public PostDto createNewPost(  @RequestBody @Valid PostDto inputPost) {
		
		return postService.createNewPost(inputPost);
	}
	
	@PutMapping("/{postId}")
	public PostDto updatePostById(@RequestBody PostDto updatedPost ,@PathVariable Long postId) {
		return postService.updatePostById(updatedPost , postId);
	}
	
	
	
}
