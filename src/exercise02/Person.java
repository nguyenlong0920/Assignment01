package exercise02;

public class Person {
    private Wallet wallet;

    public Person(int money) {
        this.wallet = new Wallet(money);
    }
    
    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}