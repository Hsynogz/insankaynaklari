package com.HR.inskay.services;

import com.HR.inskay.entity.user;
import com.HR.inskay.repository.userropository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
@Service
public class  userdetayservices {
    @Autowired
    private userropository userRepository;


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        user user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), (String) user.getPassword(), new HashSet<>());
    }
}
