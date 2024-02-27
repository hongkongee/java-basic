package oop.poly.player;

import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;

public class MainClass {
    /*
     1. Mage는 blizzard라는 광역 기술(메서드)을 가지고 있습니다.

     2. Mage 클래스에 blizzard라는 메서드를 완성하세요.

     3. 메서드 호출부에 들어갈 매개값으로 알맞은 매개변수를 선언하세요.
      광역 마법이기 때문에 타겟이 여러 명이어야 합니다.
      그런데 매개변수는 하나입니다.
      ex) m1.blizzard(???); (배열 쓰라는 소리에요.)

     4. blizzard라는 기술을 시전하는 캐릭터의 이름을 적절한 키워드를
      사용하여 출력해 보세요.

     5. 피해량(데미지)은 10 ~ 15사이의 난수를 발생시켜서
      타겟들에게 각각 적용해 주세요.
      Math.random()

     6. 기본 객체의 hp는 50입니다. hp에서 피해량을 뺀 남은 체력을
      출력해 주세요.
     */

    public static void main(String[] args) {

        Chengdu c1 = new Chengdu("쓰촨 대학");
        Chengdu c2 = new Chengdu("청두 판다 기지");

        Nanjing n1 = new Nanjing("난징 박물관");
        Nanjing n2 = new Nanjing("중화문 유적지");

        Wuhan w1 = new Wuhan("우한 화학 연구소");
        Wuhan w2 = new Wuhan("우한 대학교");

        Xian x1 = new Xian("진시황릉");
        x1.population = 150;
        x1.setCharacter("양귀비");
        x1.cityInfo();

        China[] cities = {c1, c2, n1, n2, w1, w2, x1};
        w1.covid19(cities);
        w1.covid19(cities);
        w2.covid19(cities);

        System.out.println("=================================================");

        Xian x2 = new Xian("대명궁");

        x2.tax(n2);
        x2.tax(w1);
        x2.tax(c1);
    }
}
