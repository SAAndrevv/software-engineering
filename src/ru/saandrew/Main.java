package ru.saandrew;

import ru.saandrew.template.AbstractHouse;

public class Main {

    public static void main(String[] args) {
	    Bureau bureau = new Bureau();

        House house1 = new House();
        House house2 = new House();
        House house3 = new House();

        bureau.registerHouse(house1)
                .addBasement(true)
                .registerHouse(house2)
                .addFloors((short) 2)
                .removeHouse(house1)
                .registerHouse(house3)
                .addPitchedRoof((short) 3)
                .addMaterial(AbstractHouse.Material.STONE);

        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);
    }

}
