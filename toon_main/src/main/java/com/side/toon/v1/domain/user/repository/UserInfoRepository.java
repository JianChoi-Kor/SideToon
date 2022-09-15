package com.side.toon.v1.domain.user.repository;

import com.side.toon.v1.domain.user.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
