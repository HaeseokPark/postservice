package com.thc.postservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thc.postservice.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
