package IO;

import java.io.*;

public class TestStream {
    public static void main(String[] args) {
        File f2 = new File("D:\\lol.txt");
        //把流定义在try()里,try,catch或者finally结束的时候，会自动关闭
        try (FileInputStream fis = new FileInputStream(f2)){
            byte [] b = new byte[(int)f2.length()];
            fis.read(b);
            for (byte by:b
                 ) {
                System.out.println(by);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        FileInputStream fis = null;
        try{
            File f1 = new File("D:\\lol.txt");
            fis = new FileInputStream(f1);
            byte[] all = new byte[(int) f1.length()];
            fis.read(all);
            for (byte b:all
                 ) {
                System.out.println(b);
                
            }

        }catch (IOException e){
            e.printStackTrace();
            // 在finally 里关闭流
        }finally {
            if (null != fis)
                try {
                fis.close();
                }catch (IOException e){
                e.printStackTrace();
                }
        }



        FileOutputStream fos = null;
        try {
            File f = new File("D:\\lol.txt");
            byte data[] = {1, 44};
            fos = new FileOutputStream(f);
            fos.write(data);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (null != fos){
                    fos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
