public class demo1 {
    public static void main(String[] args) {
        MyRunable run=new MyRunable();
        Thread t1=new Thread(run,"飞机");
        Thread t2=new Thread(run,"坦克");
        System.out.println(Thread.currentThread().getPriority());
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}
