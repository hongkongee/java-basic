package etc.api.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

    public static Random r = new Random();

    public static int prize1 = 0; // 1등 당첨 횟수를 기억할 변수.
    public static int prize2 = 0; // 2등 당첨 횟수를 기억할 변수.
    public static int prize3 = 0; // 3등 당첨 횟수를 기억할 변수.
    public static int prize4 = 0; // 4등 당첨 횟수를 기억할 변수.
    public static int prize5 = 0; // 5등 당첨 횟수를 기억할 변수.
    public static int failCnt = 0; // 미당첨 횟수를 기억할 변수.

    public static Set<Integer> createLotto() {
        /*
             - 1~45 범위의 난수 6개를 생성하셔서
              컬렉션 자료형에 모아서 리턴해 주세요.
              무엇을 쓰든 상관하지 않겠습니다.
              중복이 발생하면 안됩니다.
         */

        Set<Integer> set = new HashSet<>();
        while(set.size() < 6) {
            Integer i = r.nextInt(45) + 1;
            set.add(i);
        }

        return set;
    }

    // 보너스 번호를 생성하는 메서드
    public static int createBonusNum(Set<Integer> win) {
        while(true) {
            int bonus = r.nextInt(45) + 1;
            if(!win.contains(bonus)) {
                return bonus;
            }
        }
    }

    // 당첨 등수를 알려주는 메서드
    public static void checkLottoNumber(Set<Integer> win, Set<Integer> mine, int bonus) {

        /*
             매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
             내 로또 번호와 당첨번호를 비교하여
             일치하는 횟수를 세 주신 후 등수를 판단하세요.
             판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
             6개 일치 -> 1등
             5개 일치 + 보너스번호 일치 -> 2등
             5개 일치 -> 3등
             4개 일치 -> 4등
             3개 일치 -> 5등
             나머지 -> 꽝
         */
        Iterator<Integer> iter = mine.iterator();
        int count = 0;
        while (iter.hasNext()) {
//            System.out.println(iter.next());
            if(win.contains(iter.next())) {
                count++;
            }
        }

        switch (count) {
            case 6:
                prize1++;
//                System.out.println("1등 당첨");
                break;

            case 5:
                if(mine.contains(bonus)) {
                    prize2++;
//                    System.out.println("2등 당첨");
                    break;
                } else {
                    prize3++;
//                    System.out.println("3등 당첨");
                    break;
                }

            case 4:
                prize4++;
//                System.out.println("4등 당첨");
                break;

            case 3:
                prize5++;
//                System.out.println("5등 당첨");
                break;

            default:
                failCnt++;
//                System.out.println("꽝");
                break;
        }

        return;

    }


    public static void main(String[] args) {

        // 당첨 번호를 고정하자
        Set<Integer> win = createLotto();
        System.out.println("win = " + win);
        
        // 보너스 번호도 하나 고정하자
        int bonus = createBonusNum(win);
        System.out.println("bonus = " + bonus);

        int paper = 0;
        long cost = 0;
        while (true) {
            Set<Integer> myLotto = createLotto(); // 로또 구매
            System.out.print("win = " + win);
            System.out.println(" + " + bonus);
            System.out.println("myLotto = " + myLotto);

            paper++; cost += 1000;
            checkLottoNumber(win, myLotto, bonus); // 등수 확인
            if(prize1 == 1) {

                System.out.printf("누적 당첨 횟수\n2등: %d회\n3등: %d회\n4등: %d회\n5등: %d회\n꽝: %d회\n"
                        , prize2, prize3, prize4, prize5, failCnt);
                System.out.println("산 로또의 개수: " + paper + "장");
                System.out.println("산 로또의 금액: " + cost + "원");
                break; // 1등 당첨이 한 번이라도 된다면 반복문 종료
            } else {
                System.out.println("로또 " + paper + "장 째 구매 중...");
            }



        }
    }
}
