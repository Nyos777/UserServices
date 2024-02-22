package kz.message_project.userProject.repositories;

import kz.message_project.userProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

}