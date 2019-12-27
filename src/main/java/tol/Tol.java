package tol;

public class Tol {
    private Tol() {}

    // 利用静态内部类特性实现外部类的单例
    private static class SingleTonBuilder {
        private static Tol singleTon = new Tol();
    }

    public static Tol getInstance() {
        return SingleTonBuilder.singleTon;
    }

    public static void main(String[] args) {
        Tol instance = Tol.getInstance();
    }
}
