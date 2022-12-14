package com.side.toon.lib.enums;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToEnumConverterFactory implements ConverterFactory<String, Enum<? extends EnumMapperType>> {

    @Override
    public <T extends Enum<? extends EnumMapperType>> Converter<String, T> getConverter(Class<T> targetType) {
        if (EnumMapperType.class.isAssignableFrom(targetType)) {
            return new LegacyCodeToEnumConverter<>(targetType);
        } else {
            return null;
        }
    }

    private static final class LegacyCodeToEnumConverter<T extends Enum<? extends EnumMapperType>> implements Converter<String, T> {

        private final Map<Integer, T> map;

        public LegacyCodeToEnumConverter(Class<T> targetEnum) {
            T[] enumConstants = targetEnum.getEnumConstants();
            map = Arrays.stream(enumConstants)
                    .collect(Collectors.toMap(enumConstant -> ((EnumMapperType) enumConstant).getLegacyCode(), Function.identity()));
        }

        @Override
        public T convert(String source) {
            //해당 값 존재 여부 확인
            if (!StringUtils.hasText(source)) {
                return null;
            }
            
            //String to Integer
            Integer legacyCode = null;
            try {
                legacyCode = Integer.parseInt(source);
            } catch (Exception e) {
                // 변환 실패시 처리
            }

            //해당 값 map 에서 추출
            T enumValue = map.get(legacyCode);
            //해당 값이 map 에 존재하지 않을 경우 처리
            if (enumValue == null) {

            }
            return enumValue;
        }
    }
}
