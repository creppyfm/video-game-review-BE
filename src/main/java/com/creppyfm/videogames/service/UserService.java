package com.creppyfm.videogames.service;

import com.creppyfm.videogames.model.User;
import com.creppyfm.videogames.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers() { return userRepository.findAll(); }
}
