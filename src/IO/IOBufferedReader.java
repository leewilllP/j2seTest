package IO;

import java.io.*;

/*
* 缓存流
* */
public class IOBufferedReader {
    public static void main(String[] args) {
        File file = new File("D:\\lol.txt");
        try(FileWriter fw = new FileWriter(file)){
            String data = "garen kill teemo\n"+"teemo revive after 1 minutes\n"+"teemo try to garen, but killed again";
            char[] chars = data.toCharArray();
            fw.write(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File f = new File("D:\\lol.txt");
        try (
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
        ){
            while (true){
                String line = br.readLine();
                if (null == line)break;
                System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
