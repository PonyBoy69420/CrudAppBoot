package com.PonyBoy.CrudAppBoot.dao;

import com.PonyBoy.CrudAppBoot.model.User;

import java.util.List;

public interface UserDAO {
    public void createUser(User user);

    public void deleteUser(Long id);

    public void updateUser(User user);

    public User getUserById(Long id);

    public List<User> listUsers();

}
