package ru.job4j.oop;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            Product product = products[i];
            products[i] = products[1];
            products[1] = null;
            if (product != null) {
                System.out.println(product.getName());
            break;
            }
        }
        return products;
    }
}
