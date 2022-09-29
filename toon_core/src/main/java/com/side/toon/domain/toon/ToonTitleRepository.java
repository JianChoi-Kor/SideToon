package com.side.toon.domain.toon;

import com.side.toon.v1.domain.toon.entity.ToonMain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToonTitleRepository extends JpaRepository<ToonMain, Long> {
}
