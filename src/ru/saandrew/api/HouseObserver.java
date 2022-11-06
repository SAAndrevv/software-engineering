package ru.saandrew.api;

import ru.saandrew.template.AbstractHouse;

public interface HouseObserver {

    void updateFloors(short count);
    void updateBasement(boolean val);
    void updateMaterial(AbstractHouse.Material material);
    void updatePitchedRoof(short count);

}
