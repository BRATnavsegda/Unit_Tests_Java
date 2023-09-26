package org.Task_2;

public class Product implements Comparable<Product> {

    private String title; // Название
    private Integer cost; // Стоимость продукта

    public Product(String title, Integer cost) {
        this.title = title;
        this.cost = cost;
    }

    // Геттеры, сеттеры:
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return this.cost - product.cost;
    }
}
