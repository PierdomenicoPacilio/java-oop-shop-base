package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    int codice;
    String nome;
    String descrizione;
    BigDecimal prezzo;
    BigDecimal iva;

    Random generatore = new Random();

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this.codice = generatore.nextInt(100000, 999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public BigDecimal GetPrezzoBase() {
        return this.prezzo.setScale(2);
    }

    public BigDecimal GetPrezzoIva() {
        if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public String GetNomeEsteso() {
        if (nome != null) {
            return codice + " - " + nome;
        }
        return null;
    }
}
