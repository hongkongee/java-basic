package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        try {

            System.out.print("정수: ");
            int num = sc.nextInt();

            int result = 100 / num;

            System.out.println(arr[result]);
            String s = null;
            s.equals("메롱");

        } catch (InputMismatchException | ArithmeticException e) {
//            System.out.println("정수를 입력하지 않음!");
            System.out.println("입력이 잘못됨");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 벗어남");
        } catch (Exception e) {
            System.out.println("예측하지 못한 에러가 발생");
        }


        System.out.println("프로그램 정상 종료");
        sc.close();
    }
}
