package basic.constate;

import java.util.Scanner;

public class IfQuiz {
    public static void main(String[] args) {
        /*
        - 정수 3개를 입력 받습니다. (변수 하나씩 선언해서 따로따로 받으세요.)
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수1를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("정수2를 입력하세요: ");
        int b = sc.nextInt();
        System.out.print("정수3를 입력하세요: ");
        int c = sc.nextInt();

        int max, mid, min;
        if(a >= b) {
            max = a;
            min = b;
            if(c > a) {
                max = c;
                mid = a;
            } else if (a >= c && c > b) {
                mid = c;
            } else {
                min = c;
                mid = b;
            }
        } else {
            max = b;
            min = a;
            if(c > b) {
                max = c;
                mid = b;
            } else if(b >= c && c > a) {
                mid = c;
            } else {
                min = c;
                mid = a;
            }
        }

        System.out.printf("최댓값: %d, 중간값: %d, 최솟값: %d", max, mid, min);
        sc.close();
    }

}
