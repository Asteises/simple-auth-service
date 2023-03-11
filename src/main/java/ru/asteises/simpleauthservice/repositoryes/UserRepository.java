package ru.asteises.simpleauthservice.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asteises.simpleauthservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
