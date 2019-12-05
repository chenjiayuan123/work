package test;

public class test {
    public static void main(String[] args) {
        // 创建一个 Customer ，名字叫 Jane Smith
        Customer customer = new Customer("Smith", "Jane");//account此时为null
        //他有一个账号为 1000，余额为 2000 元，年利率为 1.23％ 的账户

        Account account = new Account(1000, 2000, 0.0123);
        customer.setAccount(account);

        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        System.out.println("Customer[" + customer.getLastName() +"," + customer.getFirstName() +"] has a account: id is " +""
                + customer.getAccount().getId() + ", annualInterestRate is " + customer.getAccount().getAnnualInterestRate() * 100
                + "%,balance is " + customer.getAccount().getBalance());
    }
}


