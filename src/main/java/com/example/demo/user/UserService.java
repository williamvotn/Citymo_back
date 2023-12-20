package com.example.demo.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UserService {
    public List<User> GetUsers(){
        return List.of(
                new User("test@gmail.com",
                        "password",
                        "name",
                        "fistname",
                        "phone",
                        "address",
                        "ZIP",
                        LocalDate.of(2000, Month.JANUARY,5))
        );
    }
}
