package com.minseo.pojo.service;

import com.minseo.pojo.domain.GradeDTO;

/**
 * packageName: com.minseo.pojo.service
 * fileName   : GradeService
 * author     : 최민서
 * date       : 2022-01-31
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-31     최민서        최초 생성
 */
public class GradeService {
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";

        return String.format("########## %s ########\n" +
                "*  이름: %d\n" +
                        "*  > 국어: %d 점\n" +
                        "*  > 영어: %d 점\n" +
                        "*  > 수학: %d 점\n" +
                        "*  총점: %d 점\n" +
                        "*  평균(정수): %d 점\n" +
                        "*  합격여부: %s\n" +
                        "#######################", GradeDTO.GRADE_TITLE, grade.getName(),
                grade.getKor(), grade.getEng(), grade.getMath(), total, avg, pass);
    }
}
