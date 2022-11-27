package ru.saandrew.utils;

import ru.saandrew.Turbine;
import ru.saandrew.dto.TurbineInfoDto;

import java.util.Random;

public class IndicatorsGenerator {

    private final Random random = new Random();
    private final Turbine turbine;

    public IndicatorsGenerator(Turbine turbine) {
        this.turbine = turbine;
    }

    public void generate() {
        turbine.setIndicators(
                new TurbineInfoDto(
                        random.nextDouble() * (5.6 - 4.7) + 4.7,
                        random.nextInt(520 - 340) + 340,
                        random.nextInt(3100 - 2900) + 2900

                )
        );

    }
}
