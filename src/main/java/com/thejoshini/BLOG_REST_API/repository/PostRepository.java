package com.thejoshini.BLOG_REST_API.repository;

import com.thejoshini.BLOG_REST_API.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
