package IO;

import java.io.*;

public class DataStream {
    public static void main(String[] args) {
        write();
        read();
    }
    private static void read(){
        File file = new File("D:\\DataStream\\lol.txt");
        try (
                FileInputStream fr = new FileInputStream(file);
                DataInputStream dis = new DataInputStream(fr);
        ){
            boolean b = dis.readBoolean();
            int  i = dis.readInt();
            String s = dis.readUTF();

            System.out.println(b);
            System.out.println(i);
            System.out.println(s);
            System.out.println(file.getAbsoluteFile());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        File file = new File("D:\\DataStream\\lol.txt");
        if (!file.getParentFile().exists())file.getParentFile().mkdirs();
        try (
                FileOutputStream fos = new FileOutputStream(file);
                DataOutputStream dos = new DataOutputStream(fos);

        ){
            dos.writeBoolean(true);
            dos.writeInt(1);
            dos.writeUTF("nmslaa");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
