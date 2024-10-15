package com.gss.demo.controller;


import com.gss.demo.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
public class sqlController {

    @Autowired
    private userRepository userRepository;
    @Autowired
    private EntityManager entityManager;

    @GetMapping("/user/{id}")
    public List<Object[]> findUserFromId(@PathVariable("id") String id){
//        System.out.println(id);
        return userRepository.findUserByIdUnsafe(id);
    }
}
