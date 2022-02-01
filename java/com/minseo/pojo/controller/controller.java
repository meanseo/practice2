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
        BmiDTO bmi = new BmiDTO();
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
                case 0 : System.out.println("EXIT"); return;
                case 1 :
                    System.out.println(BmiDTO.BMI_TITLE + "\n 이름, 키, 몸무게");
                    bmi.setName(scanner.next());
                    bmi.setAge(scanner.nextInt());
                    bmi.setHei(scanner.nextInt());
                    bmi.setWei(scanner.nextInt());
                    res = bmiService.getBmi(bmi);
                case 2 :
                    System.out.println(CalcDTO.CALC_TITLE + "\n 숫자 1, 연산기호, 숫자 2");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.getCalc(calc);
                case 3 :
                    System.out.println(GoogleDTO.GOOGLE_TITLE + "\n 검색어를 입력하세요.");
                    google.setSearch(scanner.next());
                    res = googleService.getGoogle(google);
                case 4 :
                    System.out.println("이름, 국어, 영어, 수학");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = gradeService.getGrade(grade);
                case 5 :
                    System.out.println(LoginDTO.LOGIN_TITLE + "\n 이름, 아이디, 비밀번호");
                    login.setName(scanner.next());
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    res = loginService.getLogin(login);
                default: res = "잘못된 번호 입니다.";
            }
            System.out.println(res);
        }
    }
}
