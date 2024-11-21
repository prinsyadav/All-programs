package org.prince.springsecurity.repo;

import org.apache.catalina.User;
import org.prince.springsecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    static Optional<User> findById(int id) {
    }
}
