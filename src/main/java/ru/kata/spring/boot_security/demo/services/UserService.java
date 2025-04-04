package ru.kata.spring.boot_security.demo.services;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void save(User user);

    User findById(Long id);

    List<User> findAll();

    void update(Long id, String name, String email, Integer age);

    void delete(Long id);

    UserDetails loadUserByUsername(String username);
}
