package com.side.toon.domain.qna;

import com.side.toon.lib.enums.EnumMapperType;
import com.side.toon.lib.enums.LegacyCodeConverter;
import lombok.Getter;

@Getter
public enum QnaState implements EnumMapperType {

    RECEIPT("접수", 1),
    CONFIRMATION("확인", 2),
    ANSWER("답변", 3)
    ;

    private String desc;
    private Integer legacyCode;

    QnaState(String desc, Integer legacyCode) {
        this.desc = desc;
        this.legacyCode = legacyCode;
    }

    @Override
    public String getCode() {
        return name();
    }

    public static class QnaStateConverter extends LegacyCodeConverter<QnaState> {
        private static final String ENUM_NAME = "문의 상태";

        public QnaStateConverter() {
            super(QnaState.class, false, ENUM_NAME);
        }
    }
}
