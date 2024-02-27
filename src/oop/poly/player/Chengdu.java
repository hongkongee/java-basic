package oop.poly.player;


public class Chengdu extends China {
    String company;
    String history;

    public Chengdu(String landMark) {
        super(landMark);
        this.company = "청두 항공";
    }

    @Override
    void cityInfo() {
        super.cityInfo();
        System.out.println("# 협력 기업: " + company);
        System.out.println("# 역사: " + history);
    }
}
