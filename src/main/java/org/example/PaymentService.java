package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @Autowired
    private Payable card;
    @Autowired
    private Payable cash;
    @Autowired
    private Payable check;

    public void paymentsMethod(TypeOfPayments typeOfPayments) {
        if (typeOfPayments == TypeOfPayments.CARD) {
            card.pay();
        } else if (typeOfPayments == TypeOfPayments.CASH) {
            cash.pay();
        } else {
            check.pay();
        }
    }
}
