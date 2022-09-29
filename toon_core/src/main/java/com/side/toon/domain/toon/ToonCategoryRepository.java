package com.side.toon.domain.toon;

import com.side.toon.v1.domain.toon.entity.ToonCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToonCategoryRepository extends JpaRepository<ToonCategory, Long> {
}
