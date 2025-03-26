package com.thejoshini.BLOG_REST_API.service;

import com.thejoshini.BLOG_REST_API.entity.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long postId, Comment newComment);
    List<Comment> getCommentByPostId(Long postId);
    Comment getCommentById(Long postId, Long commentId);
    Comment updateComment(Long postId, Long commentId, Comment updateComment);
    void deleteComment(Long postId, Long commentId);
}
