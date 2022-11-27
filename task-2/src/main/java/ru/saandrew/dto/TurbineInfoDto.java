package ru.saandrew.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurbineInfoDto {

    private double pressure;
    private int temperature;
    private int revolutionsPerSecond;

}
