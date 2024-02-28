package oop.static_.method;


import util.Utility;

import static util.Utility.*;

public class MainClass {
    public static void main(String[] args) {

        Count c = new Count();
        c.method1();

        makeLine();

        String name = input("이름을 입력하세요: ");
        System.out.println("name = " + name);

    }
}
