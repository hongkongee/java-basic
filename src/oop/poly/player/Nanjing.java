package oop.poly.player;

public class Nanjing extends China {
    String history;
    String mountain;

    Nanjing(String landMark) {
        // 모든 생성자에는 super()가 내장되어 있습니다.
        // 자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
        // 부모의 속성과 기능이 실존하게 되고, 물려줄 수 있기 때문입니다.
        super(landMark);
//        this.landMark = landMark -> 부모의 생성자가 대신 초기화

    }

    public Nanjing(String landMark, String history, String mountain) {
        super(landMark);
        this.history = history;
        this.mountain = mountain;
    }


    /*
    public Nanjing(String history, String mountain) {
        this.history = history;
        this.mountain = mountain;
    }
    */

    @Override
    void cityInfo() {
        super.cityInfo();
        System.out.println("# 역사: " + history);
        System.out.println("# 산: " + mountain);
    }
}
