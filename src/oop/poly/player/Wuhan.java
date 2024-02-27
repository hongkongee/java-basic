package oop.poly.player;

import java.util.Arrays;

public class Wuhan extends China {
    String[] foods;
    int ranking;

    public Wuhan(String landMark) {
        super(landMark);
//        wuhan.ranking = 8;
    }

    public void covid19(China[] cities) {
        System.out.println(this.landMark + "님이 코로나19 시전!");
        this.economy -= 30;
        System.out.println("30의 경제력이 소모됩니다. 남은 경제력: " + this.economy);
        System.out.println("-------------------------------");

        for (China c : cities) {
            if (c == this) {
                continue;
            }

            int damage = (int) (Math.random() * 6 + 10);
            c.population -= damage;
            System.out.printf("%s님이 %d(만명)의 인구 피해를 입었습니다. (남은 인구: %d(만명))\n"
                    , c.landMark, damage, c.population);

        }
        System.out.println("------------------------------\n");
    }

    public Wuhan(String... foods) {
        this.foods = foods;
    }

    @Override
    void cityInfo() {
        super.cityInfo();
        System.out.println("# 우한 요리: " + Arrays.toString(foods));
        System.out.println("# 우한 도시 순위: " + ranking + "위");
    }
}
