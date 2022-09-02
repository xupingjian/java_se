package com.it1;

public class test {
    public static void main(String[] args) {
        Ats a = new Ats();
        a.setBalance("asd");
        a.setId(12);
        a.setJob("fas");
        System.out.println(a.getId());
    }

}
class atss{
        private int id;
        private String balance;

    public atss() {
        }

    public atss(int id, String balance) {
            this.id = id;
            this.balance = balance;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }
    }
class Ats extends atss{
    private String job;

    public Ats() {

    }

    public Ats(String job) {

        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}




