package com.webserviceGM.demo.resources;


import com.webserviceGM.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Gustavo", "gustavo@gmail.com", "999999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
