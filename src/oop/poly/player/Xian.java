package oop.poly.player;

public class Xian extends China{
    private String character;

    public Xian() {
    }

    public Xian(String landMark) {
        super(landMark);
    }

    public Xian(String landmark, int population) {
        super(landmark, population);
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    /*
         - 전사의 고유 기능인 rush 메서드를 작성합니다.

         - rush의 대상은 모든 직업들 입니다.

         - 만약 rush의 대상이 전사라면 10의 피해를 받고,
          마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.

         - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.

         - 남은 체력도 출력해 주세요.

         - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
         */
    public void tax(China target) {
        System.out.printf("수도 징세 부처 %s이 %s에게 징세를 합니다.\n", this.landMark, target.landMark);
        int originEconomy = target.economy;
        int originPop = target.population;
        String cityName;
        
        if(target instanceof Xian) {
            target.economy -= 15;
            cityName = "시안";
        } else if (target instanceof Nanjing) {
            target.economy -= 20;
            cityName = "난징";
        } else if (target instanceof Chengdu) {
            target.economy -= 10;
            cityName = "청두";
        } else if (target instanceof Wuhan) {
            target.economy -= 10;
            target.population -= 20;
            this.population += 20;
            cityName = "우한";
        } else {
            System.out.println("징세 대상이 없습니다.");
            return;
        }
        this.economy += 10;
        System.out.printf("%s(%s)이 %d의 경제력 소모와 %d의 인구 이동을 입었습니다.\n",
                target.landMark, cityName,originEconomy - target.economy, originPop - target.population);
        System.out.printf("%s의 남은 경제력: %d\n", target.landMark, target.economy);
        System.out.printf("%s의 남은 인구: %d\n", target.landMark, target.population);
        System.out.println("-------------------------------------------");

    }

    @Override
    void cityInfo() {
        super.cityInfo();
        System.out.println("# 시안 주요 인물: " + character);
    }
}
