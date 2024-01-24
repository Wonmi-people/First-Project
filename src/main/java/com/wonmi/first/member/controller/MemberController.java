package com.wonmi.first.member.controller;

import com.wonmi.first.member.dto.MemberDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

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
                                HttpSession session,
                                @RequestBody HashMap<String, Object> map){
        String strResult = "{\"result\":\"FAIL\"}";

        String id = (String) map.get("member_id");
        String password = (String) map.get("member_password");

        System.out.println("id ====== " + id);
        System.out.println("password ====== " + password);

        try {
            // 처리 로직
            if(id == "user" && password == "userpw"){
                strResult = "{\"result\":\"OK\"}";
            }
        } catch (Exception e){
            // 오류 메세지
            System.out.println("오류 ==== " + e);
        }

        return strResult;
    }
}
