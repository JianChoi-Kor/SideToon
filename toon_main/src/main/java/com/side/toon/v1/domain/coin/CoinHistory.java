package com.side.toon.v1.domain.coin;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "coin_history")
@Setter
@NoArgsConstructor
@Entity
public class CoinHistory {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
}
