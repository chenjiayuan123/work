package Money;

public class ThreadTest{
    public static void main(String[] args) {
        Bank bank = new Bank();

        PersonA a = new PersonA(bank, "Counter");
        PersonB b = new PersonB(bank, "ATM");
        a.start();
        b.start();
    }
}