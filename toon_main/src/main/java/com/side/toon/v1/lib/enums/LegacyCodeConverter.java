package com.side.toon.v1.lib.enums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public abstract class LegacyCodeConverter<E extends Enum<E> & EnumMapperType> implements AttributeConverter<E, Integer> {
    /**
     * 대상 Enum 클래스
     */
    private Class<E> targetEnumClass;

    /**
     * nullable = false => 변환할 값이 null로 들어왔을 때 예외를 발생 시킨다.
     * nullable = true  => 변환할 값이 null이라도 예외 없이 실행, legacyCode로 반환할 시에는 null로 반환한다.
     */
    private boolean nullable;

    /**
     * nullable = false => 경우 출력할 오류 메세지에서 enum에 대한 설며을 위해 Enum의 설명적 이름을 받는다.
     */
    private String enumName;

    public LegacyCodeConverter(Class<E> targetEnumClass, boolean nullable, String enumName) {
        this.targetEnumClass = targetEnumClass;
        this.nullable = nullable;
        this.enumName = enumName;
    }

    @Override
    public Integer convertToDatabaseColumn(E attribute) {
        if (!nullable && attribute == null) {
            throw new IllegalArgumentException(String.format("%s(은)는 NULL로 저장할 수 없습니다.", enumName));
        }
        return LegacyCodeConverterUtils.toLegacyCode(attribute);
    }

    @Override
    public E convertToEntityAttribute(Integer dbData) {
        if (!nullable && dbData == null) {
            throw new IllegalArgumentException(String.format("%s(이)가 DB에 NULL 혹은 Empty로 저장되어 있습니다.", enumName));
        }
        return LegacyCodeConverterUtils.ofLegacyCode(targetEnumClass, dbData);
    }
}
