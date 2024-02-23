package oop.inherit.good;

public class Shenzhen extends China {
    int income;
    double viaHongkong;
    String language;

    public Shenzhen(int income, double viaHongkong) {
        this.income = income;
        this.viaHongkong = viaHongkong;
    }

    @Override
    void cityInfo() {
        super.cityInfo();
        System.out.println("# 선전시 수입액: " + income + "억 RMB");
        System.out.println("# 홍콩 경유 수입 비중: " + viaHongkong * 100 + "%");
        System.out.println("# 언어: " + language);
    }
}
