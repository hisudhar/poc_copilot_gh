package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private final Map<Long, User> store = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public User createUser(UserRequest request) {
        Long id = idGenerator.incrementAndGet();
        User user = new User(id, request.getName(), request.getEmail());
        store.put(id, user);
        return user;
    }

    public User getUser(Long id) {
        return store.get(id);
    }
}
