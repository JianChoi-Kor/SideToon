package com.side.toon.v1.domain.qna;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "qna_category")
@Setter
@NoArgsConstructor
@Entity
public class QnaCategory {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
}
