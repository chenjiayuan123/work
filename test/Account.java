package test;

public class Account {
    private int id;// 账号
    private double balance;// 余额
    private double annualInterestRate;// 年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    /**
     *
     * @Description: 取钱
     * @author ZengWen
     * @date 2019年7月11日 下午5:50:17
     * @param amount
     */
    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("余额不足，取款失败");
            return;
        }
        this.balance -= amount;
        System.out.println("成功取出：" + amount);
    }

    /**
     *
     * @Description: 存钱
     * @author ZengWen
     * @date 2019年7月11日 下午5:51:50
     * @param amount
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}


