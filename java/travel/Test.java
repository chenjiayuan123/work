package travel;

public class Test {
    public static void main(String[] args) {
        Travel travel = new Travel();

        Thread t1 = new Thread(travel,"张");
        t1.start();
    }
}
