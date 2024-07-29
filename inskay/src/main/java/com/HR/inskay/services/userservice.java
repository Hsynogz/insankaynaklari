package com.HR.inskay.services;

import com.HR.inskay.entity.User;
import com.HR.inskay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class userservice {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;


    @Autowired
    public userservice(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    @SuppressWarnings("unused")
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
