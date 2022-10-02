package com.side.toon.domain.user;

import com.side.toon.lib.entity.CreateDateAndUpdateDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "user_info")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class UserInfo extends CreateDateAndUpdateDate {

    /**
     * 고유값
     */
    @Id
    @Column(name = "idx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    /**
     * 파일 고유값 (프로필 이미지)
     */
    @Column(name = "profile_img_idx")
    private Long profileImgIdx;

    /**
     * 닉네임
     */
    @Column(name = "nickname")
    private String nickname;

    /**
     * 이메일
     */
    @Column(name = "email")
    private String email;

    /**
     * 휴대폰번호
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     * 생년월일(yyyyMMdd)
     */
    @Column(name = "birth")
    private String birth;

    /**
     * 성별(남성: M, 여성: F)
     */
    @Column(name = "gender")
    private String gender;

    /**
     * 회원 상태
     */
    @Column(name = "state")
    @Convert(converter = UserState.UserStateConverter.class)
    private UserState state;
}
