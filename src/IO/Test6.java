package IO;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        File f = new File("D:\\abc\\cde\\lol2.txt");
        if (!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        byte[] b = {1,5};
        try {
            FileOutputStream fos = new FileOutputStream(f);
            fos.write("呵呵".getBytes());
            fos.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream(f);
            byte[] all = new byte[(int)f.length()];
                for (byte by:all
                    ) {
                System.out.println(by);
            }
            fis.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
}
