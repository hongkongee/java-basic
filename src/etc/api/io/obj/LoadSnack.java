package etc.api.io.obj;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class LoadSnack {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("C:/Cause/snack.sav")) {

            // 객체를 불러올 보조스트림
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Snack> snackList = (List<Snack>) ois.readObject();

            for (Snack snack : snackList) {
                System.out.println("snack = " + snack);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
