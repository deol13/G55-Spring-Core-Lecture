package se.lexicon.dao.Impl;

import se.lexicon.dao.WalletDao;
import se.lexicon.model.Wallet;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class WalletDaoImpl implements WalletDao {
    private final Map<String, Wallet> storage = new HashMap<>();

    @Override
    public Wallet save(Wallet wallet) {
        wallet.setWalletId(UUID.randomUUID().toString());
        storage.put(wallet.getWalletId(), wallet);
        return wallet;
    }

    @Override
    public Optional<Wallet> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public void update(Wallet wallet) {
        storage.put(wallet.getWalletId(), wallet);
    }
}
