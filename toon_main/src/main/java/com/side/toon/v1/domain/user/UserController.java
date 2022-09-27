package com.side.toon.v1.domain.user;

import com.side.toon.v1.domain.user.enums.UserState;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    @PostMapping("")
    public void test(UserState userState) {
        System.out.println("1 : " + userState.getCode());
        System.out.println("2 : " + userState.getDesc());
        System.out.println("3 : " + userState.getLegacyCode());
    }

}
