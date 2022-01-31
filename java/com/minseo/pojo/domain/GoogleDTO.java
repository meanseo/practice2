package com.minseo.pojo.domain;

/**
 * packageName: com.minseo.pojo.domain
 * fileName   : GoogleDTO
 * author     : 최민서
 * date       : 2022-01-31
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-31     최민서        최초 생성
 */
public class GoogleDTO {
    public static String GOOGLE_TITLE = "Google";
    private String search;

    public String getSearch(){
        return search;
    }
    public void setSearch(String search){
        this.search = search;
    }
}
