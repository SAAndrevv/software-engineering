package ru.saandrew;

import ru.saandrew.dto.ProductDescription;
import ru.saandrew.facade.StoreFacade;

public class Store implements StoreFacade {

    private final StoreHouse storeHouse = StoreHouse.instance();
    private final Bank bank = Bank.instance();
    private final Delivery delivery = Delivery.instance();

    @Override
    public void doSale() {
        Customer customer = new Customer();
        customer.getInfo();

        ProductDescription description = storeHouse.inStock(customer.getProduct());
        if (description == null) {
            return;
        }

        bank.tryTransferMoney(
                customer.getPayment(),
                description.getPrice(),
                description.getSellerBankAccount()
                );

        storeHouse.subtractionFromStock(customer.getProduct());
        delivery.delivery(customer.getName());
    }
}
