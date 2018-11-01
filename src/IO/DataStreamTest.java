package IO;

import java.io.*;

/*要求
第一种方式： 使用缓存流把两个数字以字符串的形式写到文件里，再用缓存流以字符串的形式读取出来，然后转换为两个数字。
注： 两个数字之间要有分隔符用于区分这两个数字。 比如数字是31和15，如果不使用分隔符，那么就是3115，
读取出来就无法识别到底是哪两个数字。 使用分隔符31@15能解决这个问题。

第二种方式： 使用数据流DataOutputStream向文件连续写入两个数字，然后用DataInpuStream连续读取两个数字*/
public class DataStreamTest {
    public static void main(String[] args) {
        /*File file = new File("D:\\DataStream\\test.txt");
        if (!file.getParentFile().exists())file.getParentFile().mkdirs();
        try (
                FileWriter fw = new FileWriter(file);
                ){
            String s = "31@15";
            char[] chars = s.toCharArray();
            fw.write("31");
            fw.write("@");
            fw.write("15");

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
        ){
            while (true) {
                String str = br.readLine();
                if (null ==str)break;
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        File file = new File("D:\\dd\\lol.txt");
        write();
        read();
    }

    private static void write(){
        File file = new File("D:\\dd\\lol.txt");
        if (!file.getParentFile().exists())file.getParentFile().mkdirs();
        try (
                FileOutputStream fos = new FileOutputStream(file);
                DataOutputStream dos = new DataOutputStream(fos);
                ){
                    dos.writeInt(31);
                    dos.writeInt(35);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void read(){
        File file = new File("D:\\dd\\lol.txt");
        try(
                FileInputStream fis = new FileInputStream(file);
                DataInputStream dis = new DataInputStream(fis);
        ){
            int num1 = dis.readInt();
            int num2 = dis.readInt();
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(" OBJECTINPUTSTREAM".toLowerCase());

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
