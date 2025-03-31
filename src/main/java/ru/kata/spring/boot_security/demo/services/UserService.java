package ru.kata.spring.boot_security.demo.services;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    public void save(User user);

    public User findById(Long id);

    public List<User> findAll();

    public void update(User user);

    public void delete(Long id);
}
