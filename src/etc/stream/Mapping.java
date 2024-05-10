package etc.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

public class Mapping {

    // 이름과 칼로리만 가진 클래스를 설계
    private static class SimpleDish {
        private String name;
        private int calories;

        public SimpleDish(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        public SimpleDish(Dish dish) {
            this.name = dish.getName();
            this.calories = dish.getCalories();
        }

        @Override
        public String toString() {
            return "SimpleDish{" +
                    "name='" + name + '\'' +
                    ", calories=" + calories +
                    '}';
        }
    }

    private static class DishNameType {
        private String name;
        private Dish.Type type;

        public DishNameType(String name, Dish.Type type) {
            this.name = name;
            this.type = type;
        }

        public DishNameType(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }

        @Override
        public String toString() {
            return "DishNameType{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }

    public static void main(String[] args) {
        // stream의 map: 컬렉션 (리스트, 셋, 맵 ...) 에서
        // 원하는 정보만 추출하여 새로운 컬렉션으로 반환해 줌.

        List<Integer> caloreisList = menuList.stream()
//                .map(dish -> dish.getCalories())
                .map(Dish::getCalories)
                .collect(Collectors.toList());
        System.out.println(caloreisList);

        System.out.println("=======================================");

        /*
            요리 목록에서 메뉴 이름과 칼로리를 추출하고 싶다.
         */

        menuList.stream()
//                .map(dish -> new SimpleDish(dish))
                .map(SimpleDish::new)
                .collect(Collectors.toList())
//                .forEach(d -> System.out.println(d));
                .forEach(System.out::println);

        System.out.println("============================================");
        /*
            요리 목록에서 칼로리가 500 칼로리보다 큰 음식들을 필터링 한 후에
            음식의 이름과 타입 (DishNameType)만을 추출해서 출력
         */
        menuList.stream()
                .filter(d -> d.getCalories() > 500)
//                .map(d -> new DishNameType(d))
                .map(DishNameType::new)
                .collect(Collectors.toList())
//                .forEach(d -> System.out.println(d));
                .forEach(System.out::println);
    }

}
