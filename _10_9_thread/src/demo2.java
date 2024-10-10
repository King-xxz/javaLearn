public class demo2 {
    public static void main(String[] args) {
        MyRunnable run=new MyRunnable();
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
