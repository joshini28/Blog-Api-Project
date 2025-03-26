package com.thejoshini.BLOG_REST_API.service;

import com.thejoshini.BLOG_REST_API.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    Post savePost(Post post);
    Post updatePost(Long id, Post post);
    void deletePost(Long id);
}