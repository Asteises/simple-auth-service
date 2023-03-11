package ru.asteises.simpleauthservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    private UserService userService;

    @PostMapping("user/registration")
    public ResponseEntity<UserDto> userRegistration(@RequestBody UserRegDto userRegDto) {

        return ResponseEntity.ok(userService.registration(userRegDto));
    }
}
