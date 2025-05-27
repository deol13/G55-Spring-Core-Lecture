package se.lexicon;

import se.lexicon.dao.Impl.TransactionDaoImpl;
import se.lexicon.dao.Impl.WalletDaoImpl;
import se.lexicon.dao.TransactionDao;
import se.lexicon.dao.WalletDao;
import se.lexicon.dao.service.Impl.WalletServiceImpl;
import se.lexicon.dao.service.WalletService;
import se.lexicon.model.TransactionType;
import se.lexicon.model.Wallet;
import se.lexicon.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        /*
        // Initialize DAOs
        WalletDao walletDao = new WalletDaoImpl();
        TransactionDao transactionDao = new TransactionDaoImpl();

        // Create and save wallet
        Wallet createdWallet = walletDao.save(new Wallet(new BigDecimal("500.00")));
        System.out.println("Before Deposit: " + createdWallet);

        //
        BigDecimal amount = new BigDecimal("100.00");
        if (amount.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        Wallet wallet = walletDao.findById(createdWallet.getWalletId())
                .orElseThrow(() -> new IllegalArgumentException("Wallet id [" + createdWallet.getWalletId() + "] not found"));

        wallet.deposit(amount);
        walletDao.update(wallet);

        Transaction transaction = new Transaction(wallet.getWalletId(), TransactionType.DEPOSIT, amount);
        Transaction createdTransaction = transactionDao.save(transaction);
        System.out.println("wallet = " + wallet);
        System.out.println("transaction = " + createdTransaction);
         */

        WalletDao walletDao = new WalletDaoImpl();
        TransactionDao transactionDao = new TransactionDaoImpl();
        WalletService walletService = new WalletServiceImpl(walletDao, transactionDao);

        Wallet createdWallet = walletService.create(new Wallet(new BigDecimal("500.00")));
        System.out.println("createdWallet = " + createdWallet);
        System.out.println(walletService.depositTransaction(createdWallet.getWalletId(), new BigDecimal("200.00")));
    }
}