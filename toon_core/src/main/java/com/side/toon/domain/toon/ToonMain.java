package com.side.toon.domain.toon;


import com.side.toon.lib.entity.CreateDate;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "toon_main")
@Setter
@NoArgsConstructor
@Entity
public class ToonMain extends CreateDate {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    /**
     * 웹툰 카테고리
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "toon_category_idx", referencedColumnName = "idx")
    private ToonCategory toonCategory;

    /**
     * 웹툰 제목
     */
    @Column(name = "toon_title", nullable = false)
    private String toonTitle;

    /**
     * 웹툰 설명
     */
    @Column(name = "toon_info", nullable = false)
    private String toonInfo;

    /**
     * 웹툰 작가
     */
    @Column(name = "toon_writer", nullable = false)
    private String toonWriter;

    /**
     * 회차별 웹툰 정보
     */
    @OneToMany(mappedBy = "toonMain")
    private List<ToonContent> toonContents;

    /**
     * 노출 여부
     */
    @Column(name = "exposure", nullable = false)
    private boolean exposure;

    /**
     * 사용 여부(삭제 여부)  false: 삭제  true: 사용
     */
    @Column(name = "use_at", nullable = false)
    private boolean useAt;
}
