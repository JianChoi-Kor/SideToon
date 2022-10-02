package com.side.toon.domain.qna;

import com.side.toon.domain.user.User;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "qna")
@Setter
@NoArgsConstructor
@Entity
public class Qna {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @OneToMany
    @JoinColumn(name = "qna_category_idx", referencedColumnName = "idx")
    private QnaCategory qnaCategory;

    /**
     * 제목
     */
    @Column(name = "title", nullable = false)
    private String title;

    /**
     * 내용
     */
    @Column(name = "content", nullable = false)
    private String content;

    /**
     * 작성자(관리자)
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx", referencedColumnName = "idx")
    private User user;
}
