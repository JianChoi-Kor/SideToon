package com.side.toon.v1.domain.user.repository;

import com.side.toon.v1.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
