package ru.asteises.simpleauthservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.asteises.simpleauthservice.model.dto.UserRegDto;
import ru.asteises.simpleauthservice.model.dto.UserViewDto;
import ru.asteises.simpleauthservice.service.UserService;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ApiController {

    private final UserService userService;

    @PostMapping("user/registration")
    public ResponseEntity<UserViewDto> userRegistration(@RequestBody UserRegDto userRegDto) {

        return ResponseEntity.ok(userService.registration(userRegDto));
    }
}
