package exception;

public class RuntimeException {
    public static void main(String[] args) {
        try {
            int i = 10/0;
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            int a[] = new int[10];
            a[11] = 122;
        }catch (Exception e){
            System.out.println(e);
        }

        try {
            String str = null;
            System.out.println(str.length());

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
