package org.Task_2;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;

    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {

        List<Product> sortedProducts = this.getProducts();
        Collections.sort(sortedProducts);

        return sortedProducts;


        // Допишите реализацию метода самостоятельно

    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {

        List<Product> allSortedProducts = this.sortProductsByPrice();
        int quantity = allSortedProducts.size() - 1;
        return allSortedProducts.get(quantity);
        // Допишите реализацию метода самостоятельно

    }
}
