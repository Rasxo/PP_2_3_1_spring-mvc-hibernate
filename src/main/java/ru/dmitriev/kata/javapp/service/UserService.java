package ru.dmitriev.kata.javapp.service;

import ru.dmitriev.kata.javapp.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void addUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
