package com.spring.social.service;

import com.spring.social.dao.UserRepository;
import com.spring.social.model.User;
import com.spring.social.model.UserPrincaple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDetails loadByEmail(String email){
        User user = userRepository.findByEmail(email);
        UserPrincaple userPrincaple = new UserPrincaple(user);
        return userPrincaple;

    }
}
