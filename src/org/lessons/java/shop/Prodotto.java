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

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        }
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        if (price != null) {
            this.price = price;
        }
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        if (iva != null) {
            this.iva = iva;
        }
    }

    public BigDecimal getPriceWithTaxes() {
        if (price != null && iva != null) {
            return price.add(price.multiply(iva).divide(new BigDecimal(100))).setScale(2, RoundingMode.HALF_UP);
        } else {
            return null;
        }    
    }
}
