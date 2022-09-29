package com.side.toon.domain.toon;

import com.side.toon.lib.entity.CreateDateAndUpdateDate;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "toon_content")
@Setter
@NoArgsConstructor
@Entity
public class ToonContent extends CreateDateAndUpdateDate {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    /**
     * 메인 웹툰
     */
    @ManyToOne
    @JoinColumn(name = "toon_main_idx", referencedColumnName = "idx")
    private ToonMain toonMain;

    /**
     * 회차별 제목
     */
    @Column(name = "content_title")
    private String contentTitle;

    /**
     * 이미지의 그룹 대표 고유값
     */
    @Column(name = "file_group_idx")
    private Long fileGroupIdx;

    /**
     * 조회수
     */
    @Column(name = "view")
    private Long view;

    /**
     * 무료 여부
     */
    @Column(name = "free_option")
    private boolean freeOption;

    /**
     * 노출 여부
     */
    @Column(name = "exposure", nullable = false)
    private boolean exposure;

    /**
     * 삭제 여부
     */
    @Column(name = "use_at", nullable = false)
    private boolean useAt;
}
