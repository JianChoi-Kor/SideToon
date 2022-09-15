package com.side.toon.v1.domain.toon.repository;

import com.side.toon.v1.domain.toon.entity.ToonContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToonContentRepository extends JpaRepository<ToonContent, Long> {
}
