package ua.edu.ucu.apps.lab7.delivery;

import java.util.List;

import ua.edu.ucu.apps.lab7.flowers.Item;


public class PostDeliveryStrategy extends Delivery{
    @Override
    public List<Item> deliver(List<Item> items) {
        return items;
    }
}
