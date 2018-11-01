package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOPrintWriter {
    public static void main(String[] args) {
        File file = new File("D:\\dad\\lol.txt");
        if (!file.getParentFile().exists())file.getParentFile().mkdirs();
        try (
                FileWriter fw = new FileWriter(file);
                PrintWriter pw = new PrintWriter(fw);
                ){
            pw.println("garen kill teemo");
            //强制把缓存中的数据写入硬盘，无论缓存是否已满z
            pw.flush();
            pw.println("teemo revive after 1 minutes");
            pw.println("teemo try to garen, but killed again");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
