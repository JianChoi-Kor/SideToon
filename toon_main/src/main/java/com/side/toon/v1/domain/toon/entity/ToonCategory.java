package com.side.toon.v1.domain.toon.entity;

import com.side.toon.v1.lib.entity.CreateDate;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "toon_category")
@Setter
@NoArgsConstructor
@Entity
public class ToonCategory extends CreateDate {

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
    private String title;
}
