package ua.edu.ucu.apps.lab.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import ua.edu.ucu.apps.lab.flowers.Flower;
import ua.edu.ucu.apps.lab.flowers.FlowerColor;
import ua.edu.ucu.apps.lab.flowers.FlowerType;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
	@Getter
    private final int price = 45;
	@Getter
    private final double sepalLength = 0.8;

    @GetMapping("/list")
    public List<Flower> getFlowers() {
    return List.of(
        new Flower(
            FlowerType.ROSE,
            price,
            sepalLength,
            FlowerColor.RED));
    }
}
