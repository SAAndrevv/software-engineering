package ru.saandrew;

import ru.saandrew.forward.ForwardMap;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class TimedMap<K, V> extends ForwardMap<K, V> {

    private final int DEFAULT_PROLONGATION_HOURS = 1;

    private final HashMap<K, LocalDateTime> timedKey = new HashMap<>();

    private int lifetimeInHours;
    private int prolongationHour = -1;

    public TimedMap() {
        super();
    }

    public TimedMap(Map<K, V> map) {
        super(map);

        map.forEach((k, v) -> timedKey.put(k, LocalDateTime.now()));
        lifetimeInHours = DEFAULT_PROLONGATION_HOURS;
    }

    @Override
    public V get(Object key) {

        LocalDateTime dateTime = timedKey.get(key);
        if (dateTime == null) {
            return null;
        }

        if (dateTime.plusHours(lifetimeInHours).isBefore(LocalDateTime.now())) {
            return null;
        }

        return super.get(key);
    }

    @Override
    public V put(K key, V value) {
        timedKey.put(key, LocalDateTime.now());

        if (prolongationHour != -1) {
            lifetimeInHours += prolongationHour;
        } else {
            lifetimeInHours += DEFAULT_PROLONGATION_HOURS;
        }

        return super.put(key, value);
    }

    public void setProlongationHour(int hours) {
        if (hours < 1) {
            return;
        }

        prolongationHour = hours;
    }

}
