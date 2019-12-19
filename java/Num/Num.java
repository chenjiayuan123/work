package Num;

public class Num implements Runnable {
    int num = 200;

    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (num > 400){
                    break;
                }
                if(num % 2 == 1){
                    System.out.println(Thread.currentThread().getName()+"----"+num++);
                }else {
                    System.out.println(num++);
                }
            }
        }
    }
}