package strategy;

import java.math.BigDecimal;

public class Client {

    private BigDecimal interestSum;
    private BigDecimal paymentDue;

    public Client(BigDecimal interestSum, BigDecimal paymentDue) {
        this.interestSum = interestSum;
        this.paymentDue = paymentDue;
    }

    public BigDecimal getInterestSum() {
        return interestSum;
    }

    public void setInterestSum(BigDecimal interestSum) {
        this.interestSum = interestSum;
    }

    public BigDecimal getPaymentDue() {
        return paymentDue;
    }

    public void setPaymentDue(BigDecimal paymentDue) {
        this.paymentDue = paymentDue;
    }
}
