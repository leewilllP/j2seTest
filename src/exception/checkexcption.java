package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class checkexcption {
    public static void main(String[] args) {
        File f = new File("D:\\pysp\\may.txt");
        try {
            System.out.println("试图打开");
            new FileInputStream(f);
            System.out.println("成功打开");
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        }
    }
}
