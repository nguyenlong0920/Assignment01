package exercise02;

public class Wallet {
    private int money;

    public Wallet(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean payMoney(int total) {
        return money >= total;
    }
}