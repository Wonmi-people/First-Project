package com.wonmi.first.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component("MemberDTO")
@Getter
@ToString
@NoArgsConstructor
public class MemberDTO {

    private String member_id;
    private String member_password;
}
