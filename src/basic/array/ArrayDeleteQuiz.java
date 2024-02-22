package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};


        /*
         1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

         2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

         - 추가
         배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
         더 이상 지울 친구가 없다면 프로그램 종료.
         */

        outer:while (true) {
            System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
            System.out.println("삭제할 친구의 이름을 입력하세요: ");
            System.out.print("> ");
            String targetName = sc.next();
            
            // 인덱스 탐색
            int idx = -1;
            for (int i = 0; i < kakao.length; i++) {
                if(kakao[i].equals(targetName)){
                    System.out.println("이름을 찾았습니다.");
                    idx = i;
                    break;
                }
            }

            // 삭제 여부 확인
            if(idx != -1) {
                
                // 삭제 알고리즘
                String[] temp = new String[kakao.length - 1];
                for (int j = idx; j < kakao.length-1; j++) {
                    kakao[j] = kakao[j+1];
                }
                for (int k = 0; k < temp.length; k++) {
                    temp[k] = kakao[k];
                }
                kakao = temp;
                temp = null;
                System.out.printf("%s 삭제 완료!\n", targetName);
//                System.out.println(Arrays.toString(kakao));

                if(kakao.length == 0) {
                    System.out.println("더이상 삭제할 친구가 없습니다.\n 프로그램을 종료합니다.");
                    break outer;
                }

            } else {
                System.out.printf("%s은(는) 없습니다\n", targetName);
            }

        }
//        System.out.println(Arrays.toString(kakao));
        sc.close();
    }

}
