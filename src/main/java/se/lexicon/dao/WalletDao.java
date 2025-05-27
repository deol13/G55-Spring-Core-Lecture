package se.lexicon.dao;

import se.lexicon.model.Wallet;

import java.util.Optional;

public interface WalletDao {

    Wallet save(Wallet wallet);
    Optional<Wallet> findById(String id);
    void update(Wallet wallet);
}
