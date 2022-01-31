package com.minseo.pojo.controller;

import com.minseo.pojo.domain.*;
import com.minseo.pojo.service.*;

import java.util.Scanner;

/**
 * packageName: com.minseo.pojo.controller
 * fileName   : controller
 * author     : 최민서
 * date       : 2022-01-31
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-31     최민서        최초 생성
 */
public class controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDTO bim = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();
        BmiService bmiService = new BmiService();
        CalcService calcService = new CalcService();
        GoogleService googleService = new GoogleService();
        GradeService gradeService = new GradeService();
        LoginService loginService = new LoginService();

        while (true) {
            System.out.println("메뉴를 선택하세요.");
            String menu = "0.EXIT 1.BMI 2.CALC 3.GOOGLE 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String res = "";
            switch (scanner.nextInt()) {
                case 0 : res = "EXIT";
                case 1 : res = "BMI";
                case 2 : res = "CALC";
                case 3 : res = "GOOGLE";
                case 4 : res = "GRADE";
                case 5 : res = "LOGIN";
                default: res = "잘못된 번호 입니다.";
            }
            System.out.println(res);
        }
    }
}
