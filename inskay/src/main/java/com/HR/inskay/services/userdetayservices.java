package com.HR.inskay.services;

import com.HR.inskay.entity.User;
import com.HR.inskay.repository.UserRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
@Setter
@Service
public class UserdetayServices {
    @Autowired
    private UserRepository userRepository;

    @SuppressWarnings("unused")
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new HashSet<>());
    }

}
