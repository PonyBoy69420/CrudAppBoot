package com.PonyBoy.CrudAppBoot.service;

import com.PonyBoy.CrudAppBoot.dao.UserDAO;
import com.PonyBoy.CrudAppBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDao;

    public UserServiceImpl(UserDAO userDao){
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void createUser(User user) {
        userDao.save(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }


    @Override
    public User getUserById(Long id) {
        return userDao.getOne(id);
    }

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }
}
