package oop.inherit.this_super;

/*
    # 자식 클래스, 하위 클래스 (Child, Sub class)

    - 부모 클래스로부터 멤버변수(필드)와 메서드를 물려받는 클래스를
     자식 클래스라고 합니다.

    - 상속을 적용시키려면 자식 클래스 선언부의 클래스 이름 뒤에
     키워드 extends를 쓰고, 물려받을 부모 클래스의 이름을 적으시면 됩니다.
*/

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
