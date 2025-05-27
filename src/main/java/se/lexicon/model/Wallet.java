package se.lexicon.model;

import java.math.BigDecimal;

public class Wallet {
    private String walletId;
    private BigDecimal balance; // From java.math, best for balance and other situations that need calculation.

    public Wallet(BigDecimal balance) {
        this.balance = balance;
    }

    public void deposit(BigDecimal amount){
        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount){
        this.balance = this.balance.subtract(amount);
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "WalletId='" + walletId + ", Balance=" + balance;
    }
}
