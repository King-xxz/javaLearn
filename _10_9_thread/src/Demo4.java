public class Demo4 {
//    使用lambda函数进行线程的创建，lambda也叫函数式接口
public static void main(String[] args) throws InterruptedException {
    Thread t=new Thread(()->{
        while(true){
            System.out.println("hello,thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    },"线程1");
    t.start();
    while(true){
        System.out.println("hello main");
        Thread.sleep(1000);
    }
}
}
