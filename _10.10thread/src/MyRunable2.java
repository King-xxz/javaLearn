public class MyRunable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"第"+i+"次运行");
        }
    }
}
