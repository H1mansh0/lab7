package ua.edu.ucu.apps.lab7.flowers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter @NoArgsConstructor @ToString
public class Flower extends Item{
    @Getter
    private FlowerType flowerType;
    @Getter
    private double price;
    @Getter
    private double sepalLength;
    private FlowerColor color;

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
    }

    public String getColor() {
        return color.toString();
    }

    public Flower(FlowerType newFlowerType, int newPrice, double newSepalLength, FlowerColor newColor) {
        this.flowerType = newFlowerType;
        this.price = newPrice;
        this.sepalLength = newSepalLength;
        this.color = newColor;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }
}
