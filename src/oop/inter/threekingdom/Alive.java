package oop.inter.threekingdom;

public abstract class Alive implements Character {

    /*
    - 인터페이스만으로는 아무것도 할 수 없습니다.
      인터페이스를 구현하는 클래스를 통해 명세된 내용을 구현합니다.

    - 인터페이스의 구현 키워드는 implements 입니다.
      상속과 같이 클래스 이름 뒤에 구현하고자 하는 인터페이스의 이름을 씁니다.

    - 인터페이스에 선언된 추상 메서드는 반드시 구현 클래스에서
      오버라이딩을 진행하던지, abstract를 선언해서 자식에게 구현하도록 해야 합니다.

    - 인터페이스는 하나의 클래스에서 여러 개의 인터페이스를
      동시에 다중 구현할 수 있습니다. 또한 인터페이스끼리 다중 상속도 가능합니다.
     */

    String name;
    int age;


}
