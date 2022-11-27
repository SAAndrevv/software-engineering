package ru.saandrew;

import ru.saandrew.utils.IndicatorsGenerator;

public class Main {

    public static void main(String[] args) {
        Turbine turbine = new Turbine();
        turbine.registerClient(new AutomatedProcessControlSystem());

        IndicatorsGenerator indicatorsGenerator = new IndicatorsGenerator(turbine);

        try {
            while (true) {
                indicatorsGenerator.generate();
                Thread.sleep(2500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
