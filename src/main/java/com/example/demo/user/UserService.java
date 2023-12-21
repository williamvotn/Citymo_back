package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository= userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        return userRepository.findById(id)
                .orElse(null); // You can customize this part based on your requirements
    }

    public void addUser(User user){
        userRepository.save(user);
    }
}
