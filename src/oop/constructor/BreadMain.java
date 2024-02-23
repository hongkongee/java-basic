package oop.constructor;

public class BreadMain {

    public static void main(String[] args) {

        Bread bread1 = new Bread("피자빵", 1000, "밀가루");
        bread1.showBread();

        Bread bread2 = new Bread("초코케이크", 3000, "초콜렛");
        bread2.showBread();

        Bread bread3 = new Bread("마늘빵", 2500, "마늘");
        bread3.showBread();


    }
}
