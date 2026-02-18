package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void shouldCreateUser() {
        UserService service = new UserService();
        UserRequest request = new UserRequest();
        var user = service.createUser(request);
        assertNotNull(user.getId());
    }
}
