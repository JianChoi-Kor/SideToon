package com.side.toon.v1.domain.qna.repository;

import com.side.toon.v1.domain.qna.entity.Qna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QnaRepository extends JpaRepository<Qna, Long> {
}
