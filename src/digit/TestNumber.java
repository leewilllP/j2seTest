package digit;

public class TestNumber {
    public static void main(String[] args) {

        int i = 5;
        Integer it = new Integer(i);
        int i2 = it.intValue();
        System.out.println(it instanceof Number);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        byte b = 1;
        Byte by = new Byte(b);
        byte b2 = by;
        Byte b3 = b;
        System.out.println(Byte.MAX_VALUE);
        short s = 10000;
        Short sh = new Short(s);
        double d = 1.11;
        Double dou = new Double(d);
        float f = 2;
        Float fl = new Float(f);

        //数字字符串转换

        String str = String.valueOf(i);
        String str1 = it.toString();

        String str2 = "999";
        int i3 = Integer.parseInt(str2);
        System.out.println(i3);
        //练习
        float f1 = 3.14F;
        String str_f1 = String.valueOf(f1);
        Float f2 = f1;
        String str_f = f2.toString();

        float f3 = Float.parseFloat(str_f);

        String qq = "3.1e4";
        float fq = Float.parseFloat(qq);
        System.out.println(fq);
    }
}
