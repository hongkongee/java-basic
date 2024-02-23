package oop.string;

import java.util.Scanner;

public class StringQuiz {

    /*
         1. 주민등록번호 13자리를 입력받습니다.
         2. 주민등록번호는 -을 포함해서 받을 예정입니다.
         3. 13자리가 아니라면 다시 입력받습니다.
         4. ex)
         921013-1234567 -> 1992년 10월 13일 32세 남자
         960223-2345678 -> 1996년 2월 23일 28세 여자
         031125-3456789 -> 2003년 11월 25일 21세 남자
         031125-4123456 -> 2003년 11월 25일 21세 여자

         제대로 출력이 될 때까지 다시 입력 받으세요.
         */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("주민등록번호 13자리를 입력하세요: ");
            String residentId = sc.next();

            // 올바른 형식 확인
            if(residentId.indexOf("-") == -1) {
                System.out.println("-을 포함해서 입력하세요.");
                continue;
            } else if (residentId.length() != 14) {
                System.out.println("주민등록번호는 13자리 입니다.");
                continue;
            }

            int intYear = 0;
            int age = 0;
            int genNum = residentId.charAt(7) - '0'; // 1, 2, 3, 4
            if(genNum > 4 || genNum < 1) {
                System.out.println("올바르지 않은 주민등록번호입니다.");
                continue;
            }


            String year = residentId.substring(0, 2);
            if(genNum == 1 || genNum == 2) {
                intYear = Integer.parseInt("19" + year);
            } else {
                intYear = Integer.parseInt("20" + year);
            }
            int month = Integer.parseInt(residentId.substring(2, 4));
            int date = Integer.parseInt(residentId.substring(4, 6));

            age = 2024 - intYear;

            String gender;
            if(residentId.charAt(7) % 2 != 0) {
                gender = "남자";
            } else {
                gender = "여자";
            }

            System.out.printf("%d년 %d월 %d일 %d세 %s", intYear, month, date, age, gender);


            break;
        }
        sc.close();
    }

}
