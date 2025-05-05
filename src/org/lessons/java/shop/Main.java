package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto iphone16 = new Prodotto("iPhone 16", "L'ultimo smartphone rilasciato da Apple!", new BigDecimal("999.99"), new BigDecimal("22"));
        
        System.out.println(iphone16.getPriceWithTaxes());
    }
}
