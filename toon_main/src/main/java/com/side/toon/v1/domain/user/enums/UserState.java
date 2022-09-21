package com.side.toon.v1.domain.user.enums;

import com.side.toon.v1.lib.enums.EnumMapperType;
import com.side.toon.v1.lib.enums.LegacyCodeConverter;
import lombok.Getter;

@Getter
public enum UserState implements EnumMapperType {

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

    //@Getter 어노테이션이 적용되지 않는 getCode() 메서드 @Override
    @Override
    public String getCode() {
        return name();
    }

    public static class UserStateConverter extends LegacyCodeConverter<UserState> {
        private static final String ENUM_NAME = "사용자 상태";

        public UserStateConverter() {
            super(false, ENUM_NAME);
        }
    }
}
