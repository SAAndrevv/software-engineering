package ru.saandrew.api;

import ru.saandrew.dto.TurbineInfoDto;

public interface TurbineObservable {

    void registerClient(Client client);
    void removeClient(Client client);

    void notifyClients(TurbineInfoDto info);

}
