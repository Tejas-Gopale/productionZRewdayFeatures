package com.gtservice.production_ready_features.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtservice.production_ready_features.entity.PostEntity;

public interface PostRepository  extends JpaRepository<PostEntity, Long>{

}
		