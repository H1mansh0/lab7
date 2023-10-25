package ua.edu.ucu.apps.lab7.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab7.payment.PayPalPaymentStrategy;

@RestController
@RequestMapping("/api/payment")
public class PaymentPayPalController {
    @GetMapping("/paypal")
	public double getPayment() {
		return new PayPalPaymentStrategy().pay(7.8);
	}
}
