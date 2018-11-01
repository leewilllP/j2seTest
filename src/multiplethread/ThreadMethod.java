package multiplethread;

public class ThreadMethod {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            int seconds = 0;
            while (true){
                try {
                    //Sleep方法  当前线程暂停
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("已经玩了LOL%d秒了%n",seconds++);
            }
        });
        //t.setDaemon(true);//守护进程
        t.start();
    }
}
