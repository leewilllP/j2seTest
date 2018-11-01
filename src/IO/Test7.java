package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {
        File f = new File("D:\\feiz.jpg");
        File[] f1 = f.listFiles();
        byte [] data = new byte[(int)f.length()];
        File file = new File("D:\\feiz.jpg");
        int allSize = 0;
        try{
            for (int i = 0;i<f1.length;i++){
                FileInputStream fis = new FileInputStream(f1[i]);
                int size = (int) f1[i].length();
                fis.read(data,allSize,size);
                allSize += size;
                fis.close();
            }
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}