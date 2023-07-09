package org.example;

import org.springframework.stereotype.Component;

@Component
public class Check implements Payable {

    @Override
    public void pay() {
        System.out.println("Pay by check");
    }
}
