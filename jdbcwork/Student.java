package jdbcwork;


import java.sql.Date;

public class Student {
    private int num;
    private String name;
    private double grage;
    private String address;
    private String day;

    public Student() {
    }

    public Student(int num, String name, double grage, String address, String day) {
        this.num = num;
        this.name = name;
        this.grage = grage;
        this.address = address;
        this.day = day;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrage() {
        return grage;
    }

    public void setGrage(double grage) {
        this.grage = grage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", grage=" + grage +
                ", address='" + address + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
