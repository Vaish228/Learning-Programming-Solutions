package com.example.inventory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static class Product {
        private int productId;
        private String productName;
        private int quantity;
        private double price;

        public Product(int productId, String productName, int quantity, double price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "productId=" + productId +
                    ", productName='" + productName + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    '}';
        }
    }

    static class Inventory {
        private Map<Integer, Product> products = new HashMap<>();

        // Add a new product
        public void addProduct(Product product) {
            products.put(product.getProductId(), product);
        }

        // Update an existing product
        public void updateProduct(int id, String newName, int newQuantity, double newPrice) {
            Product p = products.get(id);
            if (p != null) {
                p.setProductName(newName);
                p.setQuantity(newQuantity);
                p.setPrice(newPrice);
            } else {
                System.out.println("Product not found.");
            }
        }

        // Delete a product
        public void deleteProduct(int id) {
            products.remove(id);
        }

        // Get a product
        public Product getProduct(int id) {
            return products.get(id);
        }

        // Print all products
        public void printAllProducts() {
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding Products
        inventory.addProduct(new Product(101, "Laptop", 10, 50000.0));
        inventory.addProduct(new Product(102, "Mouse", 50, 500.0));
        inventory.addProduct(new Product(103, "Keyboard", 30, 1200.0));

        System.out.println("\nAfter Adding Products:");
        inventory.printAllProducts();

        // Updating Product
        inventory.updateProduct(102, "Gaming Mouse", 60, 600.0);
        System.out.println("\nAfter Updating Product 102:");
        inventory.printAllProducts();

        // Deleting Product
        inventory.deleteProduct(103);
        System.out.println("\nAfter Deleting Product 103:");
        inventory.printAllProducts();
    }
}
