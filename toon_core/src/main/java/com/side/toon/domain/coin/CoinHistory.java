package com.side.toon.domain.coin;

import com.side.toon.domain.user.User;
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

    /**
     * 내역 고유 번호
     */
    @Column(name = "history_id", nullable = false)
    private String historyId;

    /**
     * 사용자
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx", referencedColumnName = "idx")
    private User user;


}
