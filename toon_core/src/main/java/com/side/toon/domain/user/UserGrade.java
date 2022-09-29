package com.side.toon.domain.user;

import com.side.toon.v1.lib.enums.EnumMapperType;
import com.side.toon.v1.lib.enums.LegacyCodeConverter;
import lombok.Getter;

@Getter
public enum UserGrade implements EnumMapperType {

    BRONZE("브론즈", 1),
    SILVER("실버", 2),
    GOLD("골드", 3),
    PLATINUM("플래티넘", 4),
    DIAMOND("다이아몬드", 5)
    ;

    private String desc;
    private Integer legacyCode;

    UserGrade(String desc, Integer legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }

    @Override
    public String getCode() {
        return name();
    }

    public static class UserGradeConverter extends LegacyCodeConverter<UserGrade> {
        private static final String ENUM_NAME = "사용자 등급";

        public UserGradeConverter() {
            super(UserGrade.class, false, ENUM_NAME);
        }
    }
}
