package ua.edu.ucu.apps.lab7.delivery;

import java.util.List;

import ua.edu.ucu.apps.lab7.flowers.Item;


public abstract class Delivery {
    public abstract List<Item> deliver(List<Item> items);
}

