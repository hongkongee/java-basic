package oop.encap.good;

public class MainClass {

    public static void main(String[] args) {
        MyBirth my = new MyBirth();
        my.setYear(1993);
        my.setMonth(3);
        my.setDay(35);

        my.birthInfo();
//        System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n"
//                , my.getYear("aaa1111!"), my.getMonth(), my.getDay());
        System.out.printf("내 생일은 %d년 입니다.\n", my.getYear("aaa1112!"));
    }
}
