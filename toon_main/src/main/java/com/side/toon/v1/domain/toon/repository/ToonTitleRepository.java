package com.side.toon.v1.domain.toon.repository;

import com.side.toon.v1.domain.toon.entity.ToonMain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToonTitleRepository extends JpaRepository<ToonMain, Long> {
}
