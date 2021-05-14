package com.spring.social.DB;

import com.spring.social.dao.UserRepository;
import com.spring.social.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Runner  {
/*implements CommandLineRunner
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public Runner(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setEmail("eslam@gmail.com");
        user.setPassword(passwordEncoder.encode("eslam123"));
        userRepository.save(user);
        User user1 = new User();
        user1.setEmail("ahmed@gmail.com");
        user1.setPassword(passwordEncoder.encode("ahmed123"));
        userRepository.save(user1);
    }*/
}
