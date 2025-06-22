package com.example.ecommerce;

public class Main {
    public static void main(String[] args) {

        Product[] products = {
                new Product(1012, "Laptop", "Electronics"),
                new Product(1111, "Leather Jacket", "Fashion"),
                new Product(1500, "Keyboard", "Accessories"),
                new Product(1212, "Running Shoes", "Fashion"),
                new Product(4502, "Monitor", "Electronics")
        };

        // Linear Search
        int targetId = 1212;
        Product foundProductLinear = SearchUtils.linearSearch(products, targetId);
        System.out.println("Linear Search Result for ID " + targetId + " -> " + foundProductLinear);

        SearchUtils.sortProductsById(products);

        // Binary Search
        Product foundProductBinary = SearchUtils.binarySearch(products, targetId);
        System.out.println("Binary Search Result for ID " + targetId + " -> " + foundProductBinary);
    }
}
