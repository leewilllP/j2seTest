package IO;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

public class Testfile {
    public static void main (String[] args) throws IOException{
        //相对路径
        File f1 = new File("F:\\a");
        System.out.println("f1的绝对路径:"+f1.getAbsolutePath());
        File f2 = new File("LOL.exe");
        System.out.println("f2的绝对路径:"+f2.getAbsolutePath());

        File f3 = new File(f1,"LOLX.exe");
        System.out.println(""+f3.getAbsolutePath());
        System.out.println(f3);
        File f = new File("D:\\pysp\\my.txt");
        System.out.println("文件是否存在:"+f.exists());
        System.out.println("判断是否是文件夹:"+f.isDirectory());
        System.out.println("判断是否是文件:"+f.isFile());
        System.out.println("判断文件的长度:"+f.length());

        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件最后修改时间:"+d);
        File f_re = new File("D:\\pysp\\you.txt");
        f.renameTo(f_re);
        System.out.println();

        File f4 = new File("D:\\");

        f4.list();
        // 以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        File[]fs= f4.listFiles();

        // 以字符串形式返回获取所在文件夹
        f4.getParent();

        // 以文件形式返回获取所在文件夹
        f4.getParentFile();
        // 创建文件夹，如果父文件夹skin不存在，创建就无效
        f4.mkdir();

        // 创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
        f4.mkdirs();

        // 创建一个空文件,如果父文件夹skin不存在，就会抛出异常
        f4.createNewFile();
        // 所以创建一个空文件之前，通常都会创建父目录
        f4.getParentFile().mkdirs();

        // 列出所有的盘符c: d: e: 等等
        f4.listRoots();

        // 刪除文件
        f4.delete();

        // JVM结束的时候，刪除文件，常用于临时文件的删除
        f4.deleteOnExit();
    }
}
