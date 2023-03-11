package ru.asteises.simpleauthservice.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserViewDto {

    private Long id;
    private String login;
    private String firstname;
    private String lastname;
}
