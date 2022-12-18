package ru.saandrew;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private static Map<String, Float> balance = new HashMap<>();

    private Bank() {
        balance.put("1234", 2000f);
        balance.put("4321", 0f);
    }

    public static Bank instance() {
        return new Bank();
    }

    public boolean tryTransferMoney(String from, float total, String to) {
        Float remain = balance.get(from);
        if (remain.compareTo(total) > 0) {
            balance.computeIfPresent(from, (k, v) -> v -= total);

            if (balance.containsKey(to)) {
                balance.computeIfPresent(to, (k, v) -> v += total);
            } else {
                balance.put(to, total);
            }

            return true;
        }

        return false;
    }
}
