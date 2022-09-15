package com.side.toon.v1.domain.toon.entity;


import com.side.toon.v1.lib.entity.CreateDate;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "toon_title")
@Setter
@NoArgsConstructor
@Entity
public class ToonTitle extends CreateDate {

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
    @Column(name = "title", nullable = false)
    private String title;

    /**
     * 웹툰 설명
     */
    @Column(name = "info", nullable = false)
    private String info;

    /**
     * 웹툰 작가
     */
    @Column(name = "writer", nullable = false)
    private String writer;

    /**
     * 회차별 웹툰 정보
     */
    @OneToMany(mappedBy = "toon_title", fetch = FetchType.LAZY)
    private List<ToonContent> toonContents;
}
