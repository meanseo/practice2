package com.minseo.pojo.domain;

/**
 * packageName: com.minseo.pojo.domain
 * fileName   : GradeDTO
 * author     : 최민서
 * date       : 2022-01-31
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-31     최민서        최초 생성
 */
public class GradeDTO {
    public static String GRADE_TITLE = "성적표";
    private String name;
    private int kor;
    private int eng;
    private int math;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getKor(){
        return kor;
    }
    public void setKor(int kor){
        this.kor = kor;
    }
    public int getEng(){
        return eng;
    }
    public void setEng(int eng){
        this.eng = eng;
    }
    public int getMath(){
        return math;
    }
    public void setMath(int math){
        this.math = math;
    }
}
