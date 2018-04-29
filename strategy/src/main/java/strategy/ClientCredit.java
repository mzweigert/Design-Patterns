package strategy;

import strategy.algorithm.CalculateRateAlgorithm;

import java.math.BigDecimal;

public class ClientCredit {

    private Client client;
    private CalculateRateAlgorithm algorithm;

    public ClientCredit(CalculateRateAlgorithm algorithm, Client client){
        this.algorithm = algorithm;
        this.client = client;
    }

    public void pay(BigDecimal amount){
        algorithm.pay(client, amount);
    }

    public BigDecimal getPaymentDue(){
        return client.getPaymentDue();
    }

    public BigDecimal getInterestSum(){
        return client.getInterestSum();
    }
}
