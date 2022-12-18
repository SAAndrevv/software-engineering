package ru.saandrew;

import ru.saandrew.dto.ProductDescription;

import java.util.HashMap;
import java.util.Map;

public class StoreHouse {

    private static final Map<String, ProductDescription> store = new HashMap<>();

    private StoreHouse() {
        store.putIfAbsent("Apple",
                new ProductDescription(
                        5,
                        10,
                        true,
                        "0000"
                ));
        store.putIfAbsent("TV",
                new ProductDescription(
                        1200,
                        2,
                        true,
                        "5555"
                ));
        store.putIfAbsent("Phone",
                new ProductDescription(
                    500,
                    0,
                        false,
                        "4321"
        ));
    }

    public static StoreHouse instance() {
        return new StoreHouse();
    }

    public ProductDescription inStock(String product) {
        ProductDescription description = store.get(product);
        if (description != null && description.getAmount() > 0) {
            return store.get(product);
        }

        return null;
    }

    boolean subtractionFromStock(String product) {
        if (inStock(product) != null) {
            store.computeIfPresent(product, (k, v) -> v.subtractOneFromStock());
            return true;
        }

        return false;
    }
}
