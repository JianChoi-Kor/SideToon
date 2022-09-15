package com.side.toon.v1.domain.toon;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "toon_content")
@Setter
@NoArgsConstructor
@Entity
public class ToonContent {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
}
