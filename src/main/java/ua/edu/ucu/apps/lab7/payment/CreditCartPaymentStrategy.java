package ua.edu.ucu.apps.lab7.payment;

public class CreditCartPaymentStrategy implements Payment{
    @Override
    public double pay(double price) {
        return price;
    }
}
