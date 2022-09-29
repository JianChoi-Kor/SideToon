package com.side.toon.domain.toon;

import com.side.toon.lib.entity.CreateDate;
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
