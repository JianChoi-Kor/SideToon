package com.side.toon.lib.enums;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.EnumSet;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LegacyCodeConverterUtils {

    public static <T extends Enum<T> & EnumMapperType> T ofLegacyCode(Class<T> enumClass, Integer legacyCode) {
        if (legacyCode == null) {
            return null;
        }
        return EnumSet.allOf(enumClass).stream()
                .filter(v -> v.getLegacyCode().equals(legacyCode))
                .findAny()
                //TODO: Exception 생성 후 처리
                .orElseThrow(() -> new IllegalArgumentException(String.format("enum=[%s], legacyCode=[%s]가 존재하지 않습니다.", enumClass.getName(), legacyCode)));
    }

    public static <T extends Enum<T> & EnumMapperType> Integer toLegacyCode(T enumValue) {
        if (enumValue == null) {
            return null;
        }
        return enumValue.getLegacyCode();
    }
}
