package oop.inherit.good;

/*
    # 부모 클래스, 상위 클래스 (Parent, super class)

    - 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부릅니다.
    - 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의
     멤버변수(필드)와 메서드가 상속됩니다. 단, 생성자는 상속되지 않습니다.
*/

public class China {
    int population;
    String sight;
    String landMark;
    int economy;

    void cityInfo() {
        System.out.println("*** 도시의 정보 ***");
        System.out.println("# 인구: " + population + "명");
        System.out.println("# 관광지: " + sight);
        System.out.println("# 랜드마크: " + landMark);
        System.out.println("# 경제 규모: " + economy + "억 RMB");
    }
}
