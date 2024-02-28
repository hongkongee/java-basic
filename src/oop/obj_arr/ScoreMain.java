package oop.obj_arr;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreMain {
    public static void main(String[] args) {
        /*
         - Score 객체를 담을 수 있는 배열을 선언하세요.
          배열의 크기는 넉넉하게 100개로 하겠습니다.

         - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
         입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
         총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
         (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
         객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
         이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.

         - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
          scoreInfo()를 모두 불러주세요. (반복문)
          주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
          모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
         */

        Score[] scores = new Score[100];
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while(true) {
            // while(scores[scores.length-1] == null)
            // while(i != scores.length)
            if (i > scores.length - 1) {
                System.out.println("배열 공간이 가득 차 있어서 데이터를 추가하지 못합니다.");
                break;
            }

            System.out.print("\n이름을 입력하세요: ");
            String name = sc.next();
            if(name.equals("그만")) {
                System.out.println("성적 추가를 그만둡니다.");
                break;
            }

            
            
            System.out.print("\n국어 점수를 입력하세요: ");
            int kr = sc.nextInt();


            System.out.print("\n영어 점수를 입력하세요: ");
            int en = sc.nextInt();


            System.out.print("\n수학 점수를 입력하세요: ");
            int mt = sc.nextInt();

            scores[i] = new Score(name, kr, en, mt);
            i++;
            System.out.println("---------------------------------------------------------");
        }

        System.out.println("============================================================");
//        System.out.println(Arrays.toString(scores));

        for(int j=0; scores[j] != null && j<scores.length; j++) {
            scores[j].scoreInfo();
        }

        /*
        public static boolean isValidateScore (int score) {
            if(score > 100 || score < 0) {
                System.out.println("유효하지 않은 점수입니다. ");
                return false;
            }
        }

         */

        sc.close();





    }
}
