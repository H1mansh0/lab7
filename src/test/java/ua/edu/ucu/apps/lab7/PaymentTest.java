package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.payment.CreditCartPaymentStrategy;
import ua.edu.ucu.apps.lab7.payment.PayPalPaymentStrategy;

public class PaymentTest {

    private CreditCartPaymentStrategy credit;
    private PayPalPaymentStrategy payPal;
    private double price;


    @BeforeEach
    public void init() {
        credit = new CreditCartPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
        price = 123.5;
    }

    @Test
    public void testCredit() { 
        Assertions.assertEquals(price, credit.pay(123.5));
    }

    @Test
    public void testPayPal() { 
        Assertions.assertEquals(price, payPal.pay(123.5));
    }
}
