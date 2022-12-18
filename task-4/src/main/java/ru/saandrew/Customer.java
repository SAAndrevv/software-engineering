package ru.saandrew;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Customer {

    private String name;
    private String product;
    private String payment;
    private String address;

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        setName(scanner.nextLine().trim());

        System.out.print("Product: ");
        setProduct(scanner.nextLine().trim());

        System.out.print("Payment: ");
        setPayment(scanner.nextLine().trim());

        System.out.print("Address: ");
        setAddress(scanner.nextLine().trim());
    }
}
