package ua.edu.ucu.apps.lab7.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab7.flowers.Flower;
import ua.edu.ucu.apps.lab7.flowers.FlowerColor;
import ua.edu.ucu.apps.lab7.flowers.FlowerType;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping("/list")
	public List<Flower> getFlowers() {
		return List.of(new Flower(FlowerType.ROSE, 45, 0.8, FlowerColor.RED));
	}
}
