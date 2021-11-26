package com.csi.service;

import com.csi.model.User;

import java.util.List;

public interface UserService {

    public void saveData(User user);

    public List<User> signInByAnyVariable(User user );
}
