package strategy.algorithm;

import strategy.Client;

import java.math.BigDecimal;

public interface CalculateRateAlgorithm {

    void pay(Client client, BigDecimal amount);

    default void recalculate(Client client, BigDecimal newPaymentDue, BigDecimal newInterestsSum){
        client.setPaymentDue(newPaymentDue);
        client.setInterestSum(newInterestsSum);
    }
}
