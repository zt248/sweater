package com.exampe.sweater.repos;

import com.exampe.sweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findAllByUsername (String username);
}
