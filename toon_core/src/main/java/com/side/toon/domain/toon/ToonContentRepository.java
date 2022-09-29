package com.side.toon.domain.toon;

import com.side.toon.v1.domain.toon.entity.ToonContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToonContentRepository extends JpaRepository<ToonContent, Long> {
}
