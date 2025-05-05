package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    Random rand = new Random();

    
    public Prodotto(String name, String description, BigDecimal price, BigDecimal iva) {
        this();
        this.code = rand.nextInt(99);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }
    
    public Prodotto() {
        System.out.println("Nuovo prodotto creato!");
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getPriceWithTaxes() {    
        return price.add(price.multiply(iva).divide(new BigDecimal(100))).setScale(2, RoundingMode.HALF_UP);
    }

    public void codePlusName() {
        System.out.println(code + "-" + name);
    }
}
