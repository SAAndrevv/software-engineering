package ru.saandrew.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDescription {

    private int price;
    private int amount;
    private boolean inStock;
    private String sellerBankAccount;

    public ProductDescription subtractOneFromStock() {
        if (amount > 0) {
            amount--;
        }

        return this;
    }
}
