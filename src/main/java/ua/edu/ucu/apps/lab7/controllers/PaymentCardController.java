package ua.edu.ucu.apps.lab7.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab7.payment.CreditCartPaymentStrategy;

@RestController
@RequestMapping("/api/payment")
public class PaymentCardController {
    @GetMapping("/card")
	public double getPayment() {
		return new CreditCartPaymentStrategy().pay(18.3);
	}
}
