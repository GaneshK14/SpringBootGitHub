package com.csi.controller;

import com.csi.model.User;
import com.csi.service.UserService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userServiceImpl;

    @PostMapping("/savedata")

    public ResponseEntity<String> saveData(@RequestBody User user){

        userServiceImpl.saveData(user);

        return ResponseEntity.ok("DATA SAVED SUCCESSFULLY.........!!!!");

    }
    @PostMapping("/getdata")
    public List<User> signInByAnyVar(@RequestBody User user){

        return userServiceImpl.signInByAnyVariable(user);
    }
}
