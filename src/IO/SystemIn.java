package IO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入类的名称");
        String str1 = s.nextLine();
        System.out.println("请输入属性的名称");
        String str2 = s.nextLine();
        System.out.println("替换后内容");
        String str3 = s.nextLine();

        String model = "public class @class@ {\n" +
                "    public @type@ @property@;\n" +
                "    public @class@() {\n" +
                "    }\n" +
                "    public void set@Uproperty@(@type@  @property@){\n" +
                "        this.@property@ = @property@;\n" +
                "    }\n" +
                "      \n" +
                "    public @type@  get@Uproperty@(){\n" +
                "        return this.@property@;\n" +
                "    }\n" +
                "}";



        /*try(InputStream is = System.in;){
            while (true){
                int a = is.read();
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*Scanner s = new Scanner(System.in);

        while (true){
            String str = s.nextLine();
            System.out.println(str);
        }*/
    }
}
