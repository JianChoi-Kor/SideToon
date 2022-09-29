package com.side.toon.domain.user;

import com.side.toon.v1.domain.user.enums.UserGrade;
import lombok.*;

import javax.persistence.*;

@Table(name = "user")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class User {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    /**
     * 아이디
     */
    @Column(name = "id", nullable = false)
    private String id;

    /**
     * 비밀번호
     */
    @Column(name = "password", nullable = false)
    private String password;

    /**
     * 회원 등급
     */
    @Column(name = "grade", nullable = false)
    @Convert(converter = UserGrade.UserGradeConverter.class)
    private UserGrade grade;

    /**
     * 회원 상세 정보
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idx", referencedColumnName = "user_idx")
    private UserInfo userInfo;
}
