package oop.inherit.this_super;

public class MainClass {

    public static void main(String[] args) {
        China zg = new China();
        zg.landMark = "자금성";
        System.out.println("main에서 zg의 주소값: " + zg);
        zg.cityInfo();

        System.out.println("-----------------------------------------");

        China zg2 = new China("동방명주");
        System.out.println("main에서 zg2의 주소값: " + zg2);
        zg2.cityInfo();

        System.out.println("------------------------------------------");

        Wuhan w1 = new Wuhan("르까미엔", "야보즈", "또우피", "위토우");
        w1.ranking = 8;
        w1.population = 9100000;
        w1.sight = "황학루";
        w1.landMark = "우한 장강대교";

        w1.cityInfo();

        System.out.println("-------------------------------------------");
        China zg3 = new China("진시황릉", 130000000);


        System.out.println("-------------------------------------------");
        w1.export1(zg);
        w1.export1(w1);

        System.out.println("-------------------------------------------");

        Nanjing n1 = new Nanjing("중산릉");
        n1.cityInfo();



    }
}
