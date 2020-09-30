package com.raczkowski.dao;

import com.raczkowski.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void addUser(User user);
}
