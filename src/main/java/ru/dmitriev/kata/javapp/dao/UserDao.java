package ru.dmitriev.kata.javapp.dao;

import ru.dmitriev.kata.javapp.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUserById(Long id);

    void addUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
