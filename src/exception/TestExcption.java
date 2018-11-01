package exception;

public class TestExcption {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        try {
            for (int i = 1;i<=Integer.MAX_VALUE;i++){
                str.append('a');//内存溢出
            }
        }catch (Error e){
            System.out.println(e);
        }

    }
}
