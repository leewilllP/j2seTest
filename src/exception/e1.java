package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class e1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("D:\\pysp\\my.txt");
        new FileInputStream(f);

    }
}
