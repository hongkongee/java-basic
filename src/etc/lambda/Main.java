package etc.lambda;

import java.util.List;

import static etc.lambda.Color.*;
import static etc.lambda.FilterApple.*;
import static etc.lambda.MappingApple.*;

public class Main {

    public static void main(String[] args) {
        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("============= 녹색 사과 필터링 ==============");
        List<Apple> greenApples = filterGreenApples(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println("============= 다양한 색상의 사과 필터링 ==============");
        List<Apple> yellowApple = filterAppleByColor(appleBasket, YELLOW);
        for (Apple apple : yellowApple) {
            System.out.println(apple);
        }

        System.out.println("============= 원하는 조건의 사과 필터링 ==============");
        // 100g 이하인 사과를 필터링
        List<Apple> apples1 = filterApple(appleBasket, new LightApplePredicate());
        for (Apple apple : apples1) {
            System.out.println(apple);
        }

        System.out.println("============= 원하는 조건의 사과 필터링2 ==============");
        // 빨강 또는 노랑 사과만 필터링
        // 익명 클래스 (anonymous class)
        // new 인터페이스 타입() 문법으로 즉석에서 선언하여 사용하는 클래스
        // 선언부에 추상메서드 오버라이딩을 즉시 선언하여 사용합니다.
        List<Apple> apples2 = filterApple(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getColor() == YELLOW;
            }
        });
        for (Apple apple : apples2) {
            System.out.println(apple);
        }

        System.out.println("===================================================");
        // 녹색이면서 100g 이상인 사과만 필터링
        // 인터페이스를 구현하는 익명 클래스를 람다식으로 선언.
        // 인터페이스의 추상메서드가 단 하나일 경우에만 가능합니다.
        // 구현하고자 하는 추상 메서드 내부 로직이 한 줄일 경우네는 중괄호와 리턴을 생략할 수 있습니다.
        // 어차피 filterApple의 두번째 매개값은 무조건 ApplePredicate 타입의 객체가 전달되어야 하는거고,
        // ApplePredicate는 추상메서드가 하나니까 굳이 메서드 이름을 쓸 필요가 없다.
        // 게다가 메서드 내부에는 return 한 줄만 쓸거라서 괄호와 return을 생략
        List<Apple> apples3 = filterApple(appleBasket,
                (apple) -> apple.getColor() == GREEN && apple.getWeight() >= 100);
        for (Apple apple : apples3) {
            System.out.println(apple);
        }

        System.out.println("===================================================");
        // 색깔이 빨강 혹은 초록이면서 무게가 150g 미만이어야 함.
        List<Apple> apples4 = filterApple(appleBasket,
                (apple) -> (apple.getColor() == RED || apple.getColor() == GREEN) && apple.getWeight() < 150);

        for (Apple apple : apples4) {
            System.out.println(apple);
        }

        System.out.println("========================== 여러가지 타입의 객체를 필터링 =========================");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 람다식에서 구현하는 메서드의 매개변수가 하나일 경우에는 소괄호 생략 가능.
        // 매개변수가 없거나, 두개 이상일 경우에는 소괄호 곡 붙여야 합니다.
        List<Integer> filter1 = filter(numbers, n -> n % 2 == 1);
        System.out.println("filter1 = " + filter1);

        List<String> foods = List.of("짜장면", "짬뽕", "탕수육", "피자", "삼겹살");
        List<String> filter2 = filter(foods, food -> food.length() == 3);
        System.out.println("filter2 = " + filter2);

        List<Apple> filter3 = filter(appleBasket, apple -> apple.getWeight() < 100);
        System.out.println("filter3 = " + filter3);

        System.out.println("============= 사과의 색상만 맵핑 ==============");
        List<Color> colorList = mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);

        System.out.println("============= 숫자에서 제곱수를 맵핑 ==============");
        List<Integer> map1 = map(numbers, n -> n * n);
        System.out.println("map1 = " + map1);

        System.out.println("============= 문자에서 첫글자만 맵핑 ==============");
        List<Character> map2 = map(foods, f -> f.charAt(0));
        System.out.println("map2 = " + map2);

        System.out.println("============= 사과에서 무게만 맵핑 ==============");
        List<Integer> map3 = map(appleBasket, a -> a.getWeight());
        System.out.println("map3 = " + map3);


    }
}
