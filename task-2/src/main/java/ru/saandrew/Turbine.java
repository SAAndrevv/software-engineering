package ru.saandrew;

import ru.saandrew.api.Client;
import ru.saandrew.api.TurbineObservable;
import ru.saandrew.dto.TurbineInfoDto;

import java.util.LinkedList;

public class Turbine implements TurbineObservable {

    private final LinkedList<Client> clients = new LinkedList<>();

    @Override
    public void registerClient(Client client) {
        clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        clients.remove(client);
    }

    @Override
    public void notifyClients(TurbineInfoDto info) {
        clients.forEach(client -> client.updateInfo(info));
    }

    public void setIndicators(TurbineInfoDto info) {
        notifyClients(info);
    }

}
