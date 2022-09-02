package com.it1;

public class Test12 {
    public static void main(String[] args) {
        CreditAccount ca1 = new CreditAccount();
        System.out.println(ca1.getActno()+","+ ca1.getBalance()+","+ca1.getXinyong());
        CreditAccount ca2 = new CreditAccount("11111",100000.0,0.99);
        System.out.println(ca2.getActno()+","+ ca2.getBalance()+","+ca2.getXinyong());
    }

}
//账户
class Account{
    private String actno;
    private  double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class CreditAccount extends Account{
    private Double xinyong;

    public CreditAccount() {

    }

    public CreditAccount(String actno, double balance, Double xinyong) {
/*        this.actno = actno;
        this.balance = balance;//在父类Account中是静态变量，出了父类就不能直接访问，利用super关键字调用父类构造访问从而访问两个静态变量*/
        super(actno,balance);

        this.xinyong = xinyong;
    }

    public Double getXinyong() {
        return xinyong;
    }

    public void setXinyong(Double xinyong) {
        this.xinyong = xinyong;
    }
}