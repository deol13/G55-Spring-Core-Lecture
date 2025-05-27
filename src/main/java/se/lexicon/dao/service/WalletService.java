package se.lexicon.dao.service;

import se.lexicon.model.Wallet;

import java.math.BigDecimal;

public interface WalletService {
    // register
    // deposit transaction
    // withdraw transaction
    // find wallet info by wallet id

    Wallet create(Wallet wallet);
    Wallet depositTransaction(String walletId, BigDecimal amount);
    Wallet depositWithdraw(String walletId, BigDecimal amount);
    Wallet findWalletById(String walletId);
}
