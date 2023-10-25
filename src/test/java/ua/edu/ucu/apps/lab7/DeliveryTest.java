package ua.edu.ucu.apps.lab7;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab7.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.lab7.flowers.Flower;
import ua.edu.ucu.apps.lab7.flowers.FlowerColor;
import ua.edu.ucu.apps.lab7.flowers.FlowerType;
import ua.edu.ucu.apps.lab7.flowers.Item;

public class DeliveryTest {

    private DHLDeliveryStrategy deliverDHL;
    private PostDeliveryStrategy deliverPost;
    private List<Item> listOfItems;


    @BeforeEach
    public void init() {
        deliverDHL = new DHLDeliveryStrategy();
        deliverPost = new PostDeliveryStrategy();
        listOfItems = List.of(new Flower(FlowerType.ROSE, 40, 0.8, FlowerColor.RED),
                                new Flower(FlowerType.CHAMOMILE, 35, 0.6, FlowerColor.BLUE));
    }

    @Test
    public void testDHL() { 
        Assertions.assertEquals(listOfItems, deliverDHL.deliver(listOfItems));
    }

    @Test
    public void testPost() { 
        Assertions.assertEquals(listOfItems, deliverPost.deliver(listOfItems));
    }
}
