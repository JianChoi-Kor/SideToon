package com.side.toon.domain.coin;

import com.side.toon.lib.enums.EnumMapperType;
import com.side.toon.lib.enums.LegacyCodeConverter;
import lombok.Getter;

@Getter
public enum HistoryType implements EnumMapperType {

    CHARGE("충전", 1),
    PAYMENY("결제", 2)
    ;

    private String desc;
    private Integer legacyCode;

    HistoryType(String desc, Integer legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }

    @Override
    public String getCode() {
        return name();
    }

    public static class HistoryTypeConverter extends LegacyCodeConverter<HistoryType> {
        private static final String ENUM_NAME = "내역 타입";

        public HistoryTypeConverter() {
            super(HistoryType.class, false, ENUM_NAME);
        }
    }
}
