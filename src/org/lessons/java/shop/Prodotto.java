package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private float price;
    private int iva;

    Random rand = new Random();

    public Prodotto(String name, String description, float price, int iva) {
        this.code = rand.nextInt(99);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public void getPrice() {
        System.out.println(price);
    }

    public void getPriceWithTaxes() {    
        float ivaValue = price * iva / 100;
        float totalPrice = price + ivaValue;
        System.out.printf("%.2f\n", totalPrice);
    }

    public void codePlusName() {
        System.out.println(code + "-" + name);
    }
}
