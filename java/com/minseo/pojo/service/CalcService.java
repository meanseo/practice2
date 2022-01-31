package com.minseo.pojo.service;

import com.minseo.pojo.domain.CalcDTO;

/**
 * packageName: com.minseo.pojo.service
 * fileName   : CalcService
 * author     : 최민서
 * date       : 2022-01-31
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-31     최민서        최초 생성
 */
public class CalcService {
    public String getCalc(CalcDTO calc){
        int res = 0;
        switch (calc.getOpcode()){
            case "+" : res = calc.getNum1() + calc.getNum2();
            case "-" : res = calc.getNum1() - calc.getNum2();
            case "*" : res = calc.getNum1() * calc.getNum2();
            case "/" : res = calc.getNum1() / calc.getNum2();
            default: res = 0;
        }
        return String.format("%d %s %d = %d",calc.getNum1(),calc.getOpcode(),calc.getNum2(),res);
    }
}
