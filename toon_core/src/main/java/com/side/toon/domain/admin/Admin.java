package com.side.toon.domain.admin;

import com.side.toon.lib.entity.CreateDate;
import lombok.*;

import javax.persistence.*;

@Table(name = "admin")
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Admin extends CreateDate {

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
}
