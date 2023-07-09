package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PServiceConfigBean {

    @Bean
    public PaymentService paymentService() {
        return new PaymentService();
    }

    @Bean
    public Cash cash() {
        return new Cash();
    }

    @Bean
    public Card card() {
        return new Card();
    }

    @Bean
    public Check check() {
        return new Check();
    }
}
