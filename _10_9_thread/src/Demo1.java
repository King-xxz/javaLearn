
public class Demo1 {
    public static void main(String[] args) {
        Thread thread=new MyThread();
        thread.start();
        thread.setPriority(10);
    }
}
