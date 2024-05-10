package etc.stream;

import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;
import static java.util.stream.Collectors.*;

public class Filtering {
    public static void main(String[] args) {
        // stream의 filter
        // 필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환.
        
        // 메뉴 중에 채식주의자가 먹을 수 있는 음식들만 필터링
         menuList.stream() // menuList 정보를 가진 stream 객체를 받음
                .filter(dish -> dish.isVegetarian()) // stream객체의 filter 호출(Predicate 인터페이스를 구현한 객체)
                .collect(toList()) // 필터링 된 stream 객체를 List로 변환해서 리턴.
                .forEach(dish -> System.out.println(dish)); // 리스트 내부 순회 (void)

//        dishInVegetarian.forEach(dish -> System.out.println("dish = " + dish));
        System.out.println("==== 육류이면서 600칼로리 미만의 요리를 필터링 ====");
        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT && d.getCalories() < 600)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("==== 요리 이름이 4글자인 요리를 필터링 ====");
        menuList.stream()
                .filter(d -> d.getName().length() == 4)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("==== 300칼로리보다 큰 요리만 필터링 ====");
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("=================================================================");
        System.out.println("==== 300칼로리보다 큰 요리만 필터링 ====");
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2) // 맨 앞 2개 제외
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("==== 메뉴 목록에서 처음 등장하는 생선 요리 2개 필터링 ====");
        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.FISH)
                .limit(2)
                .collect(toList())
                .forEach(d -> System.out.println(d));

    }
}
