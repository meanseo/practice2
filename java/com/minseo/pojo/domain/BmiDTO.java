package com.minseo.pojo.domain;

/**
 * packageName: com.minseo.pojo.domain
 * fileName   : BmiDTO
 * author     : 최민서
 * date       : 2022-01-31
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-31     최민서        최초 생성
 */
public class BmiDTO {
    public static String BMI_TITLE = "BMI 측정기";
    private String name;
    private int age;
    private int hei;
    private int wei;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public int getHei(){
        return hei;
    }
    public void setHei(){
        this.wei = wei;
    }
}
