package ua.edu.ucu.apps.lab7.order;

import java.util.List;

import ua.edu.ucu.apps.lab7.delivery.Delivery;
import ua.edu.ucu.apps.lab7.flowers.Item;
import ua.edu.ucu.apps.lab7.payment.Payment;

public class Order {
    protected List<Item> items;
    protected Payment payment;
    protected Delivery delivery;


    public void setPaymentStrategy(Payment newPayment) {
        this.payment = newPayment;
    }

    public void setDeliveryStrategy(Delivery newDelivery) {
        this.delivery = newDelivery;
    }

    public void calculateTotalPrice() {
        int res = 0;

        for (int i  = 0; i <= items.size(); i++) {
            res += items.get(i).price();
            System.out.println(res);
        }
    }

    public void processOrder() {

    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
