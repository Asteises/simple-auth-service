package ru.asteises.simpleauthservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.asteises.simpleauthservice.model.User;
import ru.asteises.simpleauthservice.model.dto.UserRegDto;
import ru.asteises.simpleauthservice.model.dto.UserViewDto;
import ru.asteises.simpleauthservice.repositoryes.UserRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public UserViewDto registration(UserRegDto userRegDto) {

        User user = new User();
//        user.setLogin(userRegDto.getLogin());
//        user.setFirstname(userRegDto.getFirstname());
//        user.setLastname(userRegDto.getLastname());
        user.setPassword(userRegDto.getPassword());

        user = userRepository.save(user);

        UserViewDto userViewDto = new UserViewDto();
        userViewDto.setId(user.getId());
//        userViewDto.setFirstname(user.getFirstname());
//        userViewDto.setLastname(user.getLastname());
//        userViewDto.setLogin(user.getLogin());

        log.info("User save in DB: {}", user);

        return userViewDto;
    }
}
