package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto iphone16 = new Prodotto("Iphone 16",
                "Benvenuto nel futuro. Con iPhone 16, l'esperienza d'uso si evolve, diventando straordinariamente intuitiva e potente. Progettato da zero per integrare Apple Intelligence, questo non è solo uno smartphone: è il tuo assistente personale, il tuo studio creativo e la tua finestra sul mondo, tutto in un design elegante e resistente.",
                new BigDecimal(797),
                new BigDecimal(0.22));
        System.out.println(iphone16.GetNomeEsteso());
        System.out.println("$ " + iphone16.GetPrezzoBase());
        System.out.println("$ " + iphone16.GetPrezzoIva());
    }
}
