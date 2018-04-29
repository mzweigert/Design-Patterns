package strategy.algorithm;

import strategy.Client;

import java.math.BigDecimal;

public class PaymentDueFirst implements CalculateRateAlgorithm {
    @Override
    public void pay(Client client, BigDecimal amount) {
        BigDecimal interestAmount = client.getInterestSum().subtract(amount.multiply(BigDecimal.valueOf(0.3)));
        BigDecimal paymentDueAmount  = client.getPaymentDue().subtract(amount.multiply(BigDecimal.valueOf(0.7)));
        recalculate(client, paymentDueAmount, interestAmount);
    }
}
