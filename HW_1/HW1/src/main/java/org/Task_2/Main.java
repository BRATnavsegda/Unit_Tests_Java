package org.Task_2;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Bread", 50));
        products.add(new Product("Salt", 10));
        products.add(new Product("Water", 30));
        Shop shop = new Shop(products);
        System.out.println("Shop: " + shop.getProducts());
        System.out.println("Products sorted by price: " + shop.sortProductsByPrice());
        System.out.println("Most expensive product: " + shop.getMostExpensiveProduct());

    }
}
