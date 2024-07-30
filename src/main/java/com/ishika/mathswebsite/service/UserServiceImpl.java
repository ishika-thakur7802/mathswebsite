package com.ishika.mathswebsite.service;

import com.ishika.mathswebsite.config.BasicConfiguration;
import com.ishika.mathswebsite.entities.User;
import com.ishika.mathswebsite.repositories.RoleRepository;
import com.ishika.mathswebsite.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    public UserServiceImpl(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

@Override
    public void save(User user){
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    user.setRoles(new HashSet<>(roleRepository.findAll()));
    userRepository.save(user);

}
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
