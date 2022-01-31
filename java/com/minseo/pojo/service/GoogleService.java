package com.minseo.pojo.service;

import com.minseo.pojo.domain.GoogleDTO;

/**
 * packageName: com.minseo.pojo.service
 * fileName   : GoogleService
 * author     : 최민서
 * date       : 2022-01-31
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-31     최민서        최초 생성
 */
public class GoogleService {
    public String getGoogle(GoogleDTO google){
        return String.format("검색 결과는 %s 입니다.",google.getSearch());
    }
}
