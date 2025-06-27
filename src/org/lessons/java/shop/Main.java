package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto iphone16 = new Prodotto("Iphone 16",
                "Apple",
                new BigDecimal(797),
                new BigDecimal(0.22));

        System.out.println(iphone16.GetNome());
        System.out.println(iphone16.GetMarca());
        System.out.println(iphone16.GetCodice());
        System.out.println(iphone16.GetNomeEsteso());
        System.out.println("$ " + iphone16.GetPrezzoBase());
        System.out.println(iphone16.GetIva() + "%");
        System.out.println("$ " + iphone16.GetPrezzoIva());

        System.out.println("");

        // ESEMPIO DI INSERIMENTO SBAGLIATO
        iphone16.SetNome("");
        iphone16.SetMarca("");
        iphone16.SetPrezzoBase(new BigDecimal(-20));
        iphone16.SetIva(new BigDecimal(-5));

        System.out.println("");

        System.out.println(iphone16.GetNome());
        System.out.println(iphone16.GetMarca());
        System.out.println(iphone16.GetCodice());
        System.out.println(iphone16.GetNomeEsteso());
        System.out.println("$ " + iphone16.GetPrezzoBase());
        System.out.println(iphone16.GetIva() + "%");
        System.out.println("$ " + iphone16.GetPrezzoIva());

        System.out.println("");

        // ESEMPIO DI INSERIMENTO GIUSTO
        iphone16.SetNome("Samsung Galaxy");
        iphone16.SetMarca("Samsung");
        iphone16.SetPrezzoBase(new BigDecimal(795));
        iphone16.SetIva(new BigDecimal(0.15));

        System.out.println("");

        System.out.println(iphone16.GetNome());
        System.out.println(iphone16.GetMarca());
        System.out.println(iphone16.GetCodice());
        System.out.println(iphone16.GetNomeEsteso());
        System.out.println("$ " + iphone16.GetPrezzoBase());
        System.out.println(iphone16.GetIva() + "%");
        System.out.println("$ " + iphone16.GetPrezzoIva());

    }
}
