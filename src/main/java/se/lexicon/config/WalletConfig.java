package se.lexicon.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@PropertySource("classpath:application.properties")
public class WalletConfig {
    @Value("${wallet.minimum.balance}")
    private BigDecimal minBalance;
    @Value("${wallet.maximum.deposit}")
    private BigDecimal maxDeposit;

    public BigDecimal getMinBalance() {
        return minBalance;
    }

    public BigDecimal getMaxDeposit() {
        return maxDeposit;
    }
}
