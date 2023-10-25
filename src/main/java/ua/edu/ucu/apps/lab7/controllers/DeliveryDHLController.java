package ua.edu.ucu.apps.lab7.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab7.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab7.flowers.Flower;
import ua.edu.ucu.apps.lab7.flowers.FlowerColor;
import ua.edu.ucu.apps.lab7.flowers.FlowerType;
import ua.edu.ucu.apps.lab7.flowers.Item;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryDHLController {
    @GetMapping("/dhl")
	public List<Item> getDelivery() {
		return new DHLDeliveryStrategy().deliver(List.of(new Flower(FlowerType.ROSE, 40, 0.8, FlowerColor.RED)));
	}
}
