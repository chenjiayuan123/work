package travel;

public class Travel implements Runnable {
    private int i = 10;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (i > 0){
                    try {
                        java.lang.Thread.sleep(20000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+i--);
                }else {
                    break;
                }
            }
        }
    }
}
