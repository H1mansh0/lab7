package ua.edu.ucu.apps.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab.payment.CreditCartPaymentStrategy;
import ua.edu.ucu.apps.lab.payment.PayPalPaymentStrategy;

public class PaymentTest {

    private CreditCartPaymentStrategy credit;
    private PayPalPaymentStrategy payPal;
    private final double price = 123.5;
    private final double checkingPrice = 123.5;



    @BeforeEach
    public void init() {
        credit = new CreditCartPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
    }

    @Test
    public void testCredit() {
        Assertions.assertEquals(price, credit.pay(checkingPrice));
    }

    @Test
    public void testPayPal() { 
        Assertions.assertEquals(price, payPal.pay(checkingPrice));
    }
}
