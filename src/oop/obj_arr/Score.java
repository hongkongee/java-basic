package oop.obj_arr;

public class Score {
    /*
     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
      담을 수 있는 객체를 디자인하세요.

     - 학생의 모든 정보를 한 눈에 확인할 수 있게
      scoreInfo() 메서드를 선언해 주세요.
      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */

    private String name;
    private int korean = -1;
    private int english = -1;
    private int math = -1;
    private int total = 0;
    private double average = 0;

    public Score() {}

    public Score(String name, int korean, int english, int math) {
        this.name = name;
        if(korean > 100 || korean < 0) {
            System.out.println("잘못된 점수 입력입니다.");
            return;
        }
        if(english > 100 || english < 0) {
            System.out.println("잘못된 점수 입력입니다.");
            return;
        }
        if(math > 100 || math < 0) {
            System.out.println("잘못된 점수 입력입니다.");
            return;
        }


        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    // getter(), setter()

    public void setName(String name) {
        this.name = name;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    private void calcTotal() {
        if(this.korean == -1 || this.english == -1 || this.math == -1) {
            System.out.println("점수가 누락되어 있어 총점을 계산하지 못합니다.");
            return;
        }
        this.total = this.korean + this.english + this.math;
    }

    private void calcAverage() {
        if(this.total == 0) {
            System.out.println("총점이 누락되어 있어 평균을 계산하지 못합니다.");
            return;
        }
        this.average = this.total / 3.0;
    }

    public void scoreInfo() {
        calcTotal();
        calcAverage();

        if(this.total == 0 || this.average == 0) {
            System.out.println(this.name + "은 점수가 입력되지 않았습니다.");
            System.out.println("--------------------------------------------------");
            return;
        }

        System.out.printf("이름: %s\n국어: %d점\n영어: %d점\n수학: %d점\n총점: %d점\n평균: %.2f점\n",
                this.name, this.korean, this.english, this.math, this.total, this.average);
        System.out.println("--------------------------------------------------");
    }
}
