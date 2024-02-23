package oop.inherit.good;

public class MainClass {

    public static void main(String[] args) {
        Chongqing c1 = new Chongqing();
        c1.population = 25000000;
        c1.economy = 130; // 억단위
        c1.landMark = "해방비";
        c1.sight = "리쯔바역";
        c1.railway = "충칭 메트로";

        c1.cityInfo();
        System.out.println();

        Shenzhen sz1 = new Shenzhen(65, 0.344);
        sz1.language = "광동어";
        sz1.economy = 270;
        sz1.landMark = "핑안 금융중심 전망대";
        sz1.sight = "세계지창";
        sz1.population = 11000000;

        sz1.cityInfo();
        System.out.println();

        Tianjin t1 = new Tianjin("톈진항");
        t1.economy = 150;
        t1.population = 8800000;
        t1.sight = "톈진의 눈";
        t1.landMark = "해방교";

        t1.cityInfo();
        System.out.println();
    }
}
