package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cash implements Payable {

    @Override
    public void pay() {
        System.out.println("Pay by cash");
    }
}
