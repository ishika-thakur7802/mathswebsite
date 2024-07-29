package com.ishika.mathswebsite.service;

import com.ishika.mathswebsite.entities.User;

public interface UserService {
    public void save(User user);
    public User findByUsername(String username);
}
