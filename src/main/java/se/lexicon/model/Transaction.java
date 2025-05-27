package se.lexicon.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private final String walletId;
    private final TransactionType type;
    private final BigDecimal amount;
    private final LocalDateTime dateTime;

    public Transaction(String walletId, TransactionType type, BigDecimal amount) {
        this.walletId = walletId;
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getWalletId() {
        return walletId;
    }

    public TransactionType getType() {
        return type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "[ " + dateTime + " ]" + " Transaction Info='" + transactionId + " , " + type + " , " + amount;
    }
}
