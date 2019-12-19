package thread;

public class InThread implements Runnable{
    private  int i = 20;
    String key = "";

    public void run(){
        while (true){
            synchronized (key){
                if(i > 0){
                    try {
                        java.lang.Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(java.lang.Thread.currentThread().getName()+"卖了票"+i--);
                }else {
                    break;
                }
            }
        }
    }


}
