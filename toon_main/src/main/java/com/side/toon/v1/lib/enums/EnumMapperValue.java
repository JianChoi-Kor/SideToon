package com.side.toon.v1.lib.enums;

import lombok.Getter;
import lombok.ToString;

/**
 * Enum 값을 내려주기 위한 VO 클래스
 */
@ToString
@Getter
public class EnumMapperValue {

    private String code;
    private String desc;
    private Integer legacyCode;

    public EnumMapperValue(EnumMapperType enumMapperType) {
        this.code = enumMapperType.getCode();
        this.desc = enumMapperType.getDesc();
        this.legacyCode = enumMapperType.getLegacyCode();
    }
}
