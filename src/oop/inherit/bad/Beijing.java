package oop.inherit.bad;

public class Beijing {
    int population;
    String tripSpot;
    String landMark;
    int economy;
    String politic;

    void cityInfo() {
        System.out.println("*** 도시의 정보 ***");
        System.out.println("# 인구: " + population);
        System.out.println("# 관광지: " + tripSpot);
        System.out.println("# 랜드마크: " + landMark);
        System.out.println("# 경제 규모: " + economy);
        System.out.println("# 정치: " + politic);
    }
}
