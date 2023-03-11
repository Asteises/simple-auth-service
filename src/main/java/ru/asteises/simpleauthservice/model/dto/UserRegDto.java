package ru.asteises.simpleauthservice.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegDto {

    private String login;
    private String password;
    private String firstname;
    private String lastname;
}
