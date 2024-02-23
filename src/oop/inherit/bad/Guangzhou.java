package oop.inherit.bad;

public class Guangzhou {
    int population;
    String tripSpot;
    String landMark;
    int economy;
    int income;
    int immigration;

    void cityInfo() {
        System.out.println("*** 도시의 정보 ***");
        System.out.println("# 인구: " + population);
        System.out.println("# 관광지: " + tripSpot);
        System.out.println("# 랜드마크: " + landMark);
        System.out.println("# 경제 규모: " + economy);
        System.out.println("# 수입액: " + income);
        System.out.println("# 이민자수: " + immigration);
    }
}
