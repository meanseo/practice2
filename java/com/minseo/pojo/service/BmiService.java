package com.minseo.pojo.service;

import com.minseo.pojo.domain.BmiDTO;

/**
 * packageName: com.minseo.pojo.service
 * fileName   : BmiService
 * author     : 최민서
 * date       : 2022-01-31
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-31     최민서        최초 생성
 */
public class BmiService {
    public String getBmi(BmiDTO bmi){
        return String.format("%s님 정상입니다.",bmi.getName());
    }
}
