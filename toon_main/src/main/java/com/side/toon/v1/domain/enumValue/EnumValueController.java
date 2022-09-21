package com.side.toon.v1.domain.enumValue;

import com.side.toon.v1.domain.user.enums.UserState;
import com.side.toon.v1.lib.enums.EnumMapper;
import org.springframework.context.annotation.Bean;

public class EnumValueController {

    @Bean
    public EnumMapper enumMapper() {
        EnumMapper enumMapper = new EnumMapper();

        enumMapper.put("UserState", UserState.class);

        return enumMapper;
    }
}
