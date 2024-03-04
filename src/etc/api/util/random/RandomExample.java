package etc.api.util.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random r = new Random();

        // 실수 난수: 0.0 <= ~ < 1.0
        double d = r.nextDouble();
        System.out.println("d = " + d);

        // 정수 난수: nextInt();
        int i = r.nextInt(); // 기본범위: int의 전범위
        System.out.println("i = " + i);


    }
}
