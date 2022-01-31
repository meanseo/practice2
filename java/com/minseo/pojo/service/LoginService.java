package com.minseo.pojo.service;

import com.minseo.pojo.domain.LoginDTO;

/**
 * packageName: com.minseo.pojo.service
 * fileName   : LoginService
 * author     : 최민서
 * date       : 2022-01-31
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-31     최민서        최초 생성
 */
public class LoginService {
    public String getLogin(LoginDTO login){
        return (login.getPw().equals(LoginDTO.PASSWORD)) ? String.format("%s 님, 아이디 %s와 비밀번호가 일치합니다. " +
                "로그인 성공",login.getName(),login.getId()) : String.format("%s 님, 아이디 %s 는 맞고 비밀번호가 틀립니다." +
                "로그인 실패",login.getName(),login.getId());
    }
}
