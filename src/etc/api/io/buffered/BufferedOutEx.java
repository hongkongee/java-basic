package etc.api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutEx {

    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            text.append(i + "안녕하세요!\n");
        }

        long start = System.currentTimeMillis();

        // Buffered가 붙은 객체들은 기존에 사용했던 객체를 생성자의 매개값으로 전달.
        // ex) BufferedOutPutStream -> FileOutputStream을 매개값으로 받아야 한다.
        // BufferedInputStream -> FileInputStream을 매개값으로 받아야 한다.
        try (FileOutputStream fos = new FileOutputStream("C:/Cause/bout.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            // 더미 데이터를 StringBuilder로 생성함.
            // 새로운 String 객체 생성 -> 생성자의 매개값으로 StringBuilder를 전달.
            // 바이트 데이터로 변환.
            String str = new String(text); // StringBuilder를 String으로 변환
            byte[] data = str.getBytes();
            fos.write(data);

        } catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("소요시간: " + (end-start)*0.001 + "초");
    }
}
