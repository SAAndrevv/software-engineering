package ru.saandrew.template;

import ru.saandrew.api.HouseObserver;

public abstract class AbstractHouse implements HouseObserver {

    public enum Material {
        WOOD, STONE
    }

    private short floors;
    private boolean basement;
    private Material material;

    public AbstractHouse() {
        floors = 1;
        basement = false;
        material = Material.WOOD;
    }

    public final void setFloors(short count) {
        if (count > 0 && count <= 3) {
            floors = count;
        }
    }

    public final int getFloors() {
        return floors;
    }

    public final void setBasement(boolean val) {
        basement = val;
    }

    public final boolean getBasement() {
        return basement;
    }

    public final void setMaterial(Material material) {
        this.material = material;
    }

    public final Material getMaterial() {
        return material;
    }

    @Override
    public void updateFloors(short count) {
        setFloors(count);
    }

    @Override
    public void updateBasement(boolean val) {
        setBasement(val);
    }

    @Override
    public void updateMaterial(Material material) {
        setMaterial(material);
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof AbstractHouse)) {
            return false;
        }

        AbstractHouse abstractHouse = (AbstractHouse) o;
        return abstractHouse.floors == floors &&
                abstractHouse.basement == basement &&
                abstractHouse.material == material;
    }

    @Override
    public int hashCode() {
        int result = Short.hashCode(floors);
        result = 31 * result + Boolean.hashCode(basement);
        result = 31 * result + material.hashCode();

        return result;
    }

    @Override
    public String toString() {
        return String.format("Floors: %d\n" +
                "Basement: %s\n" +
                "Material: %s\n",
                floors, basement, material.toString());
    }

}
