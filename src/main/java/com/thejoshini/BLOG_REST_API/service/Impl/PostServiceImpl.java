package com.thejoshini.BLOG_REST_API.service.Impl;

import com.thejoshini.BLOG_REST_API.entity.Post;
import com.thejoshini.BLOG_REST_API.exception.ResourceNotFoundException;
import com.thejoshini.BLOG_REST_API.repository.PostRepository;
import com.thejoshini.BLOG_REST_API.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Long id) {
        Post post = postRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("post", "postId", id));
        return post;
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(Long id, Post post) {
        Post savePost = postRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("post", "postId", id));
        savePost.setTitle(post.getTitle());
        savePost.setDescription(post.getDescription());
        savePost.setContent(post.getContent());
        return postRepository.save(savePost);
    }

    @Override
    public void deletePost(Long id) {
        Post post = postRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("post", "postId", id));
        postRepository.delete(post);
    }
}

