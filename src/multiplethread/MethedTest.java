package multiplethread;

public class MethedTest {
    public static void main(String[] args) {

        Thread thread = new Thread(()->{
            while (true){
                for (int i=1;i<=3;i++){
                    System.out.println("波动拳第"+i+"发");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    while (i==3){
                        i=0;
                        System.out.println("开始为时5秒的充能");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });thread.start();
    }
}
