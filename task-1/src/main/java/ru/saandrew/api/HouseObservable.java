package ru.saandrew.api;

import ru.saandrew.template.AbstractHouse;

public interface HouseObservable {

    HouseObservable registerHouse(HouseObserver houseObserver);
    HouseObservable removeHouse(HouseObserver houseObserver);

    void notifyFloors(short count);
    void notifyBasement(boolean val);
    void notifyMaterial(AbstractHouse.Material material);
    void notifyPitchedRoof(short count);

}
