package com.side.toon.domain.notice;

import com.side.toon.lib.enums.EnumMapperType;
import com.side.toon.lib.enums.LegacyCodeConverter;
import lombok.Getter;

@Getter
public enum NoticeType implements EnumMapperType {

    NOTICE("공지사항", 1),
    EVENT("이벤트", 2)
    ;

    private String desc;
    private Integer legacyCode;

    NoticeType(String desc, Integer legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }

    //@Getter 어노테이션이 적용되지 않는 getCode() 메서드 @Override
    @Override
    public String getCode() {
        return name();
    }

    public static class NoticeTypeConverter extends LegacyCodeConverter<NoticeType> {
        private static final String ENUM_NAME = "공지 타입";

        public NoticeTypeConverter() {
            super(NoticeType.class, false, ENUM_NAME);
        }
    }
}
