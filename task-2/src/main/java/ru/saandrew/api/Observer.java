package ru.saandrew.api;

import ru.saandrew.dto.TurbineInfoDto;

public interface Observer {

    void updateInfo(TurbineInfoDto info);

}
