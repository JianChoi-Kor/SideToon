package com.side.toon.domain.toon;


import com.side.toon.v1.lib.entity.CreateDate;
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
    @OneToMany(mappedBy = "toonMain", fetch = FetchType.LAZY)
    private List<ToonContent> toonContents;
}
