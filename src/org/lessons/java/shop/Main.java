package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto iphone16 = new Prodotto("iPhone 16", "L'ultimo smartphone rilasciato da Apple!", 999.99f, 22);

        iphone16.getPrice();
        System.out.printf("%.2f", iphone16.getPriceWithTaxes());
    }
}
