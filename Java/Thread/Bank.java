public class Bank {
    int account;
    int balance;
    Bank(int account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public synchronized void depositor(int amount) {
        balance += amount;
    }

    public synchronized boolean withdrawer(int amount) {
        if(balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
}
