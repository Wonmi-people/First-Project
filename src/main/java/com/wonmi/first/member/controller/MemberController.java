package com.wonmi.first.member.controller;

import com.wonmi.first.member.dto.MemberDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@RestController
public class MemberController {

    @GetMapping("/member/signin")
    public ModelAndView signIn (Locale locale,
                                HttpSession session){
        ModelAndView mav = new ModelAndView("/member/signin");
        return mav;
    }

    @PostMapping("/signin")
    public String signInAction (Locale locale,
                                MemberDTO memberDTO,
                                HttpSession session){
        String strResult = "{\"result\":\"FAIL\"}";

        try {
            // 처리 로직
            strResult = "{\"result\":\"OK\"}";
        } catch (Exception e){
            // 오류 메세지
        }

        return strResult;
    }
}
