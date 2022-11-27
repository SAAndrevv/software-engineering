package ru.saandrew;

import ru.saandrew.api.Client;
import ru.saandrew.dto.TurbineInfoDto;

public class AutomatedProcessControlSystem implements Client {

    @Override
    public void updateInfo(TurbineInfoDto info) {
        checkPressure(info.getPressure());
        checkTemperature(info.getTemperature());
        checkRevolutionsPerSecond(info.getRevolutionsPerSecond());
    }

    private void checkPressure(double pressure) {
        System.out.println("Pressure: " + String.format("%.1f", pressure));
        if (pressure < 4.8 || pressure > 5.5) {
            System.out.println(" Warning");
        }
    }

    private void checkTemperature(int temperature) {
        System.out.println("Temperature: " + temperature);
        if (temperature < 360 || temperature > 500) {
            System.out.println(" Warning");
        }
    }

    private void checkRevolutionsPerSecond(int revolutionsPerSecond) {
        System.out.println("Revolutions per second: " + revolutionsPerSecond);
        if (revolutionsPerSecond < 2999 || revolutionsPerSecond > 3001) {
            System.out.println(" Warning");
        }
    }

}
