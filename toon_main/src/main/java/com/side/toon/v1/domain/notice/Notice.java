package com.side.toon.v1.domain.notice;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "notice")
@Setter
@NoArgsConstructor
@Entity
public class Notice {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
}
