package strategy;

import org.junit.Test;
import strategy.algorithm.InterestFirst;
import strategy.algorithm.PaymentDueFirst;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculateRateAlgorithmTest {

    @Test
    public void testCalculateInterestFirstAlgorithm() {
        // GIVEN
        BigDecimal interestsSum = new BigDecimal("1000");
        BigDecimal paymentDue = new BigDecimal("10000");
        BigDecimal rate = new BigDecimal("500");
        Client client = new Client(interestsSum, paymentDue);
        ClientCredit clientCredit = new ClientCredit(new InterestFirst(), client);
        BigDecimal expectedPaymentDueAfterRecalculate = paymentDue.subtract(rate.multiply(BigDecimal.valueOf(0.3)));
        BigDecimal expectedInterestsSumAfterRecalculate = interestsSum.subtract(rate.multiply(BigDecimal.valueOf(0.7)));

        // WHEN
        clientCredit.pay(rate);
        // THEN
        assertThat(clientCredit.getPaymentDue()).isEqualTo(expectedPaymentDueAfterRecalculate);
        assertThat(clientCredit.getInterestSum()).isEqualTo(expectedInterestsSumAfterRecalculate);
    }

    @Test
    public void testCalculatePaymentDueFirstAlgorithm() {
        // GIVEN
        BigDecimal interestsSum = new BigDecimal("1000");
        BigDecimal paymentDue = new BigDecimal("10000");
        BigDecimal rate = new BigDecimal("500");
        Client client = new Client(interestsSum, paymentDue);
        ClientCredit clientCredit = new ClientCredit(new PaymentDueFirst(), client);
        BigDecimal expectedPaymentDueAfterRecalculate = paymentDue.subtract(rate.multiply(BigDecimal.valueOf(0.7)));
        BigDecimal expectedInterestsSumAfterRecalculate = interestsSum.subtract(rate.multiply(BigDecimal.valueOf(0.3)));

        // WHEN
        clientCredit.pay(rate);
        // THEN
        assertThat(clientCredit.getPaymentDue()).isEqualTo(expectedPaymentDueAfterRecalculate);
        assertThat(clientCredit.getInterestSum()).isEqualTo(expectedInterestsSumAfterRecalculate);
    }
}
