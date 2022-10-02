package com.side.toon.domain.qna;

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

    /**
     * 카테고리 이름
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 사용 여부(삭제 여부)  false: 삭제  true: 사용
     */
    @Column(name = "use_at", nullable = false)
    private boolean useAt;
}
