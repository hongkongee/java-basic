package oop.inherit.this_super;


public class China {
    int population;
    String sight;
    String landMark;
    int economy;

    China() {
        System.out.println("중국의 기본 생성자 호출!");
        System.out.println("생성자에서 this의 주소값: " + this);
        this.population = 1400000000;
        this.sight = "만리장성";
        this.economy = 4630;
    }

    China(String landMark) {
        this(); // 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 합니다.
        System.out.println("중국의 2번 생성자 호출!");
        System.out.println("생성자에서 this 의 주소값: " + this);
//        population = 1400000000;
//        sight = "만리장성";
//        economy = 4630;
        this.landMark = landMark;

    }

    China(String landmark, int population) {
        this(landmark);
        System.out.println("중국의 3번 생성자 호출!");
        this.population = population;
//        this.landMark = landmark;
    }

    void export1(China target) {
//        System.out.println("수출 도시 = " + this.landMark);
//        System.out.println("수입 도시 = " + target.landMark);
        if(this == target) {
            System.out.println("스스로는 수출이 불가능합니다.");
            return;
        }

        // 출력 메세지: x가 y에게 수출합니다.
        System.out.printf("%s가 %s에게 수출합니다.\n", this.landMark, target.landMark);

        // 수입 도시의 경제 규모를 134 RMB 낮추고 수출 도시의 경제 규모를 221 RMB 높입니다.

        target.economy -= 13400000;
        this.economy += 22100000;

        System.out.printf("수출 도시: %d, 수입 도시: %d\n", this.economy, target.economy);

    }

    void cityInfo() {
        System.out.println("*** 도시의 정보 ***");
        System.out.println("# 인구: " + population + "명");
        System.out.println("# 관광지: " + sight);
        System.out.println("# 랜드마크: " + landMark);
        System.out.println("# 경제 규모: " + economy + "억 RMB");
    }
}
