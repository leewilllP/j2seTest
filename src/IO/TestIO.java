package IO;

import java.io.File;

public class TestIO {
    public static void main(String[] args) {
        File f =  new File("F:\\迅雷下载");
        File[] fs = f.listFiles();
        if (null == fs)
            return;
        long MaxSize = 0;
        long MinSize = Integer.MAX_VALUE;
        File MaxFile = null;
        File MinFile = null;
        for (File files:fs){
            if (null == fs)
                continue;
            if (files.length()>MaxSize){
                MaxSize = files.length();
                MaxFile = files;
            }
            if (files.length() != 0 && files.length()< MinSize){
                MinSize = files.length();
                MinFile = files;
            }
        }
        System.out.printf("%s,////%d字节%n",MaxFile.getAbsoluteFile(),MaxFile.length());
        System.out.printf("%s,////%d字节%n",MinFile.getAbsoluteFile(),MinFile.length());

    }
}
