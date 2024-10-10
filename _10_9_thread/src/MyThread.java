class MyThread extends Thread{
    public MyThread() {
        super();
    }
    public void run(){
        while(true){
            System.out.println("hello,thread");
            try {
                Thread.sleep(1000);
            }catch(Exception e){
                throw new RuntimeException(e);
            }
        }

    }
}
