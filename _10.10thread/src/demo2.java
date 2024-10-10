public class demo2 {
//    守护线程（备胎线程）
//    当非守护线程结束时，守护线程会陆续结束
public static void main(String[] args) {
    MyRunable run=new MyRunable();
    MyRunable2 run2=new MyRunable2();
    Thread t1=new Thread(run2,"妹妹");
    Thread t2=new Thread(run,"备胎");
    t2.setDaemon(true);
    t1.start();
    t2.start();
}
}
