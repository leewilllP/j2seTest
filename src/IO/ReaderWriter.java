package IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {
    public static void main(String[] args) {
        File file = new File("D:\\lol.txt");
        try(FileReader fr = new FileReader(file)) {
            char[] chars = new char[(int)file.length()];
            fr.read(chars);
            for (char c:chars
                 ) {
                System.out.print(c);

            }
        }catch (IOException e){
            e.printStackTrace();
        }
        File f = new File("D:\\lol.txt");
        try (FileWriter fw = new FileWriter(f)){
            String data = "wocaonima";
            char[] chars = data.toCharArray();
            fw.write(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
