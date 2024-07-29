package com.ishika.mathswebsite.service;

public interface SecurityService {
        String findLoggedInUsername();
        void autoLogin(String username, String password);
}
