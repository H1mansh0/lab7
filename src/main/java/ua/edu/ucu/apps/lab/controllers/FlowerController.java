package ua.edu.ucu.apps.lab.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab.flowers.Flower;
import ua.edu.ucu.apps.lab.flowers.FlowerColor;
import ua.edu.ucu.apps.lab.flowers.FlowerType;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping("/list")
	public List<Flower> getFlowers() {
		int price = 45;
		double sepalLength = 0.8;
		return List.of(
			new Flower(
				FlowerType.ROSE, price, sepalLength, FlowerColor.RED));
	}
}
