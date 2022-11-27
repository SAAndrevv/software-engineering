package ru.saandrew;

import ru.saandrew.api.HouseObservable;
import ru.saandrew.api.HouseObserver;
import ru.saandrew.template.AbstractHouse;

import java.util.ArrayList;
import java.util.List;

public class Bureau implements HouseObservable {

    private final List<HouseObserver> houses = new ArrayList<>();

    public Bureau addFloors(short count) {
        notifyFloors(count);
        return this;
    }

    public Bureau addBasement(boolean val) {
        notifyBasement(val);
        return this;
    }

    public Bureau addMaterial(AbstractHouse.Material material) {
        notifyMaterial(material);
        return this;
    }

    public Bureau addPitchedRoof(short count) {
        notifyPitchedRoof(count);
        return this;
    }

    @Override
    public final Bureau registerHouse(HouseObserver houseObserver) {
        houses.add(houseObserver);
        return this;
    }

    @Override
    public final Bureau removeHouse(HouseObserver houseObserver) {
        houses.remove(houseObserver);
        return this;
    }

    @Override
    public final void notifyFloors(short count) {
        houses.forEach(h -> h.updateFloors(count));
    }

    @Override
    public final void notifyBasement(boolean val) {
        houses.forEach(h -> h.updateBasement(val));
    }

    @Override
    public final void notifyMaterial(AbstractHouse.Material material) {
        houses.forEach(h -> h.updateMaterial(material));
    }

    @Override
    public final void notifyPitchedRoof(short count) {
        houses.forEach(h -> h.updatePitchedRoof(count));
    }

}
