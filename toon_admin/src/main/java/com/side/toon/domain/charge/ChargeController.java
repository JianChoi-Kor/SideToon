package com.side.toon.domain.charge;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/charge")
public class ChargeController {

    private ChargeService chargeService;

    //충전 내역
    @GetMapping("")
    public ModelAndView chargeList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/charge/tables");

        return modelAndView;
    }
}
