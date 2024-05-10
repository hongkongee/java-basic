package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {
    public static void main(String[] args) {

        // 음식 목록 중 칼로리가 낮은 순으로 정렬 (오름차순 정렬)
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("===================================================");
        // 음식 목록 중 칼로리가 높은 순으로 정렬 (내림차순 정렬)
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("===================================================");
        // 500칼로리보다 작은 요리중에 top3 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500) // 칼로리가 500 미만인 음식을 거른다.
                .sorted(comparing((Dish::getCalories)).reversed()) // 거른 음식 정렬 (높은 순)
                .limit(3) // 정렬된 음식 중 상위 3개만 자르기
                .collect(toList())
                .forEach(System.out::println);
        
        
    }
}
