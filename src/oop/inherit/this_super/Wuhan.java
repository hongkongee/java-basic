package oop.inherit.this_super;

import java.util.Arrays;

public class Wuhan extends China {
    String[] foods;
    int ranking;

    public Wuhan(String landMark) {
        super(landMark);
//        wuhan.ranking = 8;
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
