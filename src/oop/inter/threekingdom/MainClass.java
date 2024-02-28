package oop.inter.threekingdom;

public class MainClass {
    public static void main(String[] args) {

//        Character a = Character(); (x)
        /*
        - 다형성은 상속이 전제되어야 하는 것이 원칙이지만
          예외로 인터페이스와 클래스간의 구현 관계에서도
          다형성 발생을 허용합니다.
         */

        Character cao = new Caocao();
        General lv = new Lvbu();
        General dz = new Dongzhuo();
        Intelligence ys = new Yuanshao();
        // Interface_type name = new Class_name(); -> 다형성

        /*
         - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
          정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.

         - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
          구현하는 클래스들끼리 서로 즉시 형 변환이 가능합니다. (연결만 되어있으면 형변환 가능)
         */

        // ys의 타입은 Intelligence -> force()에 대한 정보 없음 -> Character 타입으로 즉시 형변환 가능
        // -> Yuanshao 클래스가 결국 Character 과 연관이 있기 때문에
        ((Character)ys).force("도룡도");

        Character[] characters = {cao, (Character) lv, (Character) dz, (Character) ys};
    }
}
