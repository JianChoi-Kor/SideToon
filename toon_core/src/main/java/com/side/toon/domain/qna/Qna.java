package com.side.toon.domain.qna;

import com.side.toon.domain.admin.Admin;
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

    /**
     * 문의 카테고리
     */
    @ManyToOne(targetEntity = QnaCategory.class, fetch = FetchType.LAZY)
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
     * 문의 작성자(사용자)
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx", referencedColumnName = "idx")
    private User user;

    /**
     * 문의 답변자(관리자)
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_idx", referencedColumnName = "idx")
    private Admin admin;

    /**
     * 문의 상태
     */
    @Column(name = "state", nullable = false)
    @Convert(converter = QnaState.QnaStateConverter.class)
    private QnaState state;

    /**
     * 사용 여부(삭제 여부)  false: 삭제  true: 사용
     */
    @Column(name = "use_at", nullable = false)
    private boolean useAt;
}
