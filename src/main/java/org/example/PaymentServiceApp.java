package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PaymentServiceApp {
    public static void main(String[] args) {

        // Configuration based on Java-Bean
        ApplicationContext contextBean = new AnnotationConfigApplicationContext(PServiceConfigBean.class);
        PaymentService paymentServiceBean = contextBean.getBean(PaymentService.class);
        paymentServiceBean.paymentsMethod(TypeOfPayments.CARD);
        paymentServiceBean.paymentsMethod(TypeOfPayments.CASH);
        paymentServiceBean.paymentsMethod(TypeOfPayments.CHECK);

        System.out.println("=========================");

        // Configuration based on Java-Component
        ApplicationContext contextComponent = new AnnotationConfigApplicationContext(PServiceConfigComponent.class);
        PaymentService paymentServiceComponent = contextComponent.getBean(PaymentService.class);
        paymentServiceComponent.paymentsMethod(TypeOfPayments.CARD);
        paymentServiceComponent.paymentsMethod(TypeOfPayments.CASH);
        paymentServiceComponent.paymentsMethod(TypeOfPayments.CHECK);
    }
}