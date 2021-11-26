package com.csi.dao;

import com.csi.model.User;

import java.util.List;

public interface UserDao {

    public void saveData(User user);

    public List<User> signInByAnyVariable(User user );

}
