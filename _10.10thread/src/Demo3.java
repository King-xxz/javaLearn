public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        Runnable run=new MyRunable();
        Thread t=new Thread(run,"线程1");
        t.start();

        t.join();//插入线程，就是让t线程插入当前线程，t：线程1，当前线程：main
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+"@mian");
        }

    }
}
