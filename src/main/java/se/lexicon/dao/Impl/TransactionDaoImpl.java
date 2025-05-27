package se.lexicon.dao.Impl;

import org.springframework.stereotype.Component;
import se.lexicon.dao.TransactionDao;
import se.lexicon.model.Transaction;

import java.util.*;

//@Component
public class TransactionDaoImpl implements TransactionDao {
    private Map<String, Transaction> storage = new HashMap<>();

    @Override
    public Transaction save(Transaction transaction) {
        transaction.setTransactionId(UUID.randomUUID().toString());
        storage.put(transaction.getWalletId(), transaction);
        return transaction;
    }

    @Override
    public Optional<Transaction> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Transaction> findByWalletId() {
        return new ArrayList<>(storage.values());
    }
}
