package com.side.toon.v1.domain.toon;


import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "toon_title")
@Setter
@NoArgsConstructor
@Entity
public class ToonTitle {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
}
