package com.gss.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Repository
public class userRepository {

    @Autowired
    private EntityManager entityManager;

    public List<Object[]> findUserByIdUnsafe(String id) {
        String sql = "SELECT * FROM users WHERE id = '" + id + "'";
        Query query = entityManager.createNativeQuery(sql);
    return query.getResultList();
    }
}
