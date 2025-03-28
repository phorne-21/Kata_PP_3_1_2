package ru.kata.spring.boot_security.demo.Dao;


import web.kata.pre_project.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();

    void add(User user);

    void update(User user);

    void delete(Long id);

    User findById(Long id);
}
