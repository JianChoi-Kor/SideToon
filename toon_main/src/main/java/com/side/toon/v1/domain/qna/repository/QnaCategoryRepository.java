package com.side.toon.v1.domain.qna.repository;

import com.side.toon.v1.domain.qna.entity.QnaCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QnaCategoryRepository extends JpaRepository<QnaCategory, Long> {
}
