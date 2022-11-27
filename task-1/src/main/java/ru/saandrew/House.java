package ru.saandrew;

import ru.saandrew.template.AbstractHouse;

public class House extends AbstractHouse {

    private short pitchedRoof;

    public House() {
        super();
        pitchedRoof = 1;
    }

    public void setPitchedRoof(short count) {
        if (count > 0 && count <= 5) {
            pitchedRoof = count;
        }
    }

    public short getPitchedRoof() {
        return pitchedRoof;
    }

    @Override
    public void updatePitchedRoof(short count) {
        setPitchedRoof(count);
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof House)) {
            return false;
        }

        House house = (House) o;
        return super.equals(o) &&
               house.pitchedRoof == pitchedRoof;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Short.hashCode(pitchedRoof);

        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Pitched roof: %d\n", pitchedRoof);
    }

}
