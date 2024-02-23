package oop.constructor;

/*
        String breadName = "피자빵";
        int price = 1000;
        String ingredient = "밀가루";

        System.out.println("이름: " + breadName);
        System.out.println("가격: " + price + "원");
        System.out.println("주재료: " + ingredient);

        String breadName2 = "초코케이크";
        int price2 = 3000;
        String ingredient2 = "초콜렛";

        System.out.println("이름: " + breadName2);
        System.out.println("가격: " + price2 + "원");
        System.out.println("주재료: " + ingredient2);

        객체를 생성하지 않았을 때의 예시를 보고
        Bread 클래스를 생성해서 설계를 해 주세요.
        빵의 정보를 나타내는 출력문은 Bread의 메서드로 처리해 주세요.
        방금 배웠던 생성자를 활용하셔도 좋습니다.
        클래스 제작이 완료되면 main 메서드에 객체를 생성해서 결과를 출력해 보세요.
         */
public class Bread {
    String breadName;
    int price;
    String ingredient;


    // 기본 생성자를 자동으로 만들어 주는 것은 생성자가 하나도 선언되어 있지 않을 때만
    // 자동으로 생성됩니다.
    // 매개값을 아무것도 받지 않는 기본 생성자는 클래스 내에 존재하는 편이 좋습니다.
    // 매개값을 받는 여러 생성자를 이용할 수도 있지만, 기본 형태로 생성되어야 할 일도 있기 때문.
    Bread() {}

    Bread(String bName, int bPrice, String bIngredient) {
        breadName = bName;
        price = bPrice;
        ingredient = bIngredient;
    }

    void showBread() {
        System.out.println("********** 빵 정보 **********");
        System.out.println("이름: " + breadName);
        System.out.println("가격: " + price + "원");
        System.out.println("주재료: " + ingredient + "\n");
    }
}
