package com.thejoshini.BLOG_REST_API.service;

import com.thejoshini.BLOG_REST_API.payload.LoginDto;
import com.thejoshini.BLOG_REST_API.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);

}
