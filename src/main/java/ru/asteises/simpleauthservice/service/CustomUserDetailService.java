package ru.asteises.simpleauthservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.asteises.simpleauthservice.model.User;
import ru.asteises.simpleauthservice.repositoryes.UserRepository;

/**
 * UserDetailsService отвечает за доступ к информации о пользователе хранящейся в БД, нужно только
 * перезаписать метод loadUserByUsername();
 */
@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username).orElseThrow();
        return null;
    }
}
