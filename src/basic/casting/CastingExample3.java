package basic.casting;

public class CastingExample3 {

    public static void main(String[] args) {
        char c = 'B'; // 66
        int i = 2;
        int intResult = c + i;
        char charResult = (char) (c + i);

        System.out.println("intResult = " + intResult);
        System.out.println("charResult = " + charResult);
        
        int k = 10;
        double d = (double) k / 4.0; // 분모 분자 중 하나만 double로 바꿔줘도 됨
        System.out.println("d = " + d);
    }
}
