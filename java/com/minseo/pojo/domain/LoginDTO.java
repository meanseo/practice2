package com.minseo.pojo.domain;

/**
 * packageName: com.minseo.pojo.domain
 * fileName   : LoginDTO
 * author     : 최민서
 * date       : 2022-01-31
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-31     최민서        최초 생성
 */
public class LoginDTO {
    public static String LOGIN_TITLE = "=== LOGIN ===";
    private String name;
    private String id;
    private String pw;
    public static String PASSWORD = "abc";

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }public String getPw(){
        return pw;
    }
    public void setPw(String pw){
        this.pw = pw;
    }
}
