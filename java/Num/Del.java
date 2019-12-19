package Num;

public class Del {
    public static void main(String[] args) {
        Num n = new Num();
        Thread t1 = new Thread(n, "线程1");
        Thread t2 = new Thread(n, "线程2");
        Thread t3 = new Thread(n, "线程3");
        t1.start();
        t2.start();
        t3.start();
    }

}

