package com.side.toon.domain.notice;

import com.side.toon.domain.admin.Admin;
import com.side.toon.lib.entity.CreateDateAndUpdateDate;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "notice")
@Setter
@NoArgsConstructor
@Entity
public class Notice extends CreateDateAndUpdateDate {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    /**
     * 공지 타입(공지사항, 이벤트)
     */
    @Column(name = "type", nullable = false)
    @Convert(converter = NoticeType.NoticeTypeConverter.class)
    NoticeType type;

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
     * 조회수
     */
    @Column(name = "view", nullable = false)
    private Long view = 0L;

    /**
     * 작성자(관리자)
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_idx", referencedColumnName = "idx")
    private Admin admin;

    /**
     * 노출 여부  false: 미노출  true: 노출
     */
    @Column(name = "exposure", nullable = false)
    private boolean exposure;

    /**
     * 사용 여부(삭제 여부)  false: 삭제  true: 사용
     */
    @Column(name = "use_at", nullable = false)
    private boolean useAt;
}
