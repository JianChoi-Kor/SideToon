package com.side.toon.v1.domain.user.enums;

import com.side.toon.v1.lib.enums.LegacyCommonType;
import lombok.Getter;

@Getter
public enum UserState implements LegacyCommonType {

    NORMAL("정상", 1),
    UNCERTIFIED("미인증", 2),
    SUSPENSION("정지", 3),
    WITHDRAWAL("탈퇴", 4)
    ;

    private String desc;
    private Integer legacyCode;

    UserState(String desc, Integer legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }


}
