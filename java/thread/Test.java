package thread;

public class Test {
    public static void main(String[] args) {
        InThread th = new InThread();

        Thread th1 = new Thread(th,"站A");
        Thread th2 = new Thread(th,"站B");
        Thread th3 = new Thread(th,"站C");
        Thread th4 = new Thread(th,"站D");

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}