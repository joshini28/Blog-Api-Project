package com.thejoshini.BLOG_REST_API.repository;

import com.thejoshini.BLOG_REST_API.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(Long postId);
}
