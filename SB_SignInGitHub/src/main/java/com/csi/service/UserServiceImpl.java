package com.csi.service;

import com.csi.dao.UserDao;
import com.csi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

   @Autowired
    UserDao userDaoImpl;
    @Override
    public void saveData(User user) {

        userDaoImpl.saveData(user);
    }

    @Override
    public List<User> signInByAnyVariable(User user) {
        return userDaoImpl.signInByAnyVariable(user);
    }
}
