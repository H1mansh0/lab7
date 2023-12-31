package ua.edu.ucu.apps.lab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import ua.edu.ucu.apps.lab.payment.PayPalPaymentStrategy;

@RestController
@RequestMapping("/api/payment")
public class PaymentPayPalController {
    @Getter
    private final double price = 182.8;

    @GetMapping("/paypal")
    public double getPayment() {
        return new PayPalPaymentStrategy().pay(price);
    }
}
