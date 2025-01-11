package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Wall wall1 = new Wall("North");
        wall1.create();
        Wall wall2 = new Wall("East");
        wall2.create();
        Wall wall3 = new Wall("South");
        wall3.create();
        Wall wall4 = new Wall("West");
        wall4.create();
        Ceiling ceiling = new Ceiling(130, PaintColor.RED);
        ceiling.create();
        Bed bed = new Bed("Two Person", 2, 200, 180, 2);
        bed.make();
        Lamp lamp = new Lamp(LampType.LAVA, true, 10);
        lamp.turnOn();
        Wardrobe wardrobe = new Wardrobe(150, 220, 18);
        wardrobe.add();
        Carpet carpet = new Carpet(100, 200, PaintColor.RED);
        carpet.lying();

        Bedroom bedroom = new Bedroom("Adult Bedroom" ,wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);
        System.out.println(bedroom);
    }
}