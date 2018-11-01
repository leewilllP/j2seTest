package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextThrowable {
    public static void main(String[] args) {
        File f = new File("D:\\pysp\\may.txt");
        try {
            new FileInputStream(f);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
