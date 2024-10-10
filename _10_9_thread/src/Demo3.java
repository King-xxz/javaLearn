public class Demo3 {
//    使用匿名函数进行线程的创建
public static void main(String[] args) throws InterruptedException {
    Thread t=new Thread(){
        @Override
        public void run() {
            while(true){
                System.out.println(this.getName()+"正在运行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    };
    t.setName("线程1");
    t.start();
    while (true){
        System.out.println("hello main");
        Thread.sleep(1000);
    }

}

}
