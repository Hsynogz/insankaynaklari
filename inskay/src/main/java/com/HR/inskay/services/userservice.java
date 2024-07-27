package com.HR.inskay.services;

import com.HR.inskay.entity.user;
import com.HR.inskay.repository.userropository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class userservice {

    private final userropository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;


    @Autowired
    public userservice(userropository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public user saveUser(user user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public user findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
