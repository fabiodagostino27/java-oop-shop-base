package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    public int code;
    public String name;
    public String description;
    public float price;
    public int iva;

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

    public float getPriceWithTaxes() {    
        float ivaValue = price * iva / 100;
        float totalPrice = price + ivaValue;
        return totalPrice;
    }
}
