package ua.edu.ucu.apps.lab7.flowers.filters;

import ua.edu.ucu.apps.lab7.flowers.Item;

public interface SearchFilter {
    boolean match(Item item);
}
