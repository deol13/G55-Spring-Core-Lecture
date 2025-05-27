package se.lexicon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.lexicon.dao.Impl.TransactionDaoImpl;
import se.lexicon.dao.Impl.WalletDaoImpl;
import se.lexicon.dao.TransactionDao;
import se.lexicon.dao.WalletDao;

@Configuration
@ComponentScan(basePackages = "se.lexicon")
public class AppConfig {

    @Bean
    public WalletDao walletDao(){
        return new WalletDaoImpl();
    }

    @Bean
    public TransactionDao transactionDao(){
        return new TransactionDaoImpl();
    }
}
