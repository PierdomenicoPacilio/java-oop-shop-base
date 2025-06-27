package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    Random generatore = new Random();

    // COSTRUTTORI
    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        this.codice = generatore.nextInt(100000, 999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto() {
        this.codice = generatore.nextInt(100000, 999999);
        this.nome = "Prodotto senza nome";
        this.marca = "Marca del prodotto";
        this.prezzo = new BigDecimal(0);
        this.iva = new BigDecimal(0);
    }

    // CODICE
    public int GetCodice() {
        return this.codice;
    }

    // NOME
    public String GetNome() {
        return this.nome;
    }

    public void SetNome(String nome) {
        if (nome != null && nome.length() > 0) {
            this.nome = nome;
        }
    }

    // NOME ESTESO
    public String GetNomeEsteso() {
        if (nome != null && nome.length() > 0) {
            return codice + " - " + nome;
        }
        return null;
    }

    // MARCA
    public String GetMarca() {
        return this.marca;
    }

    public void SetMarca(String marca) {
        if (marca != null && marca.length() > 0) {
            this.marca = marca;
        }
    }

    // PREZZO BASE
    public BigDecimal GetPrezzoBase() {
        return this.prezzo.setScale(2);
    }

    public void SetPrezzoBase(BigDecimal prezzo) {
        if (prezzo.compareTo(BigDecimal.ZERO) > 0 && prezzo != null) {
            this.prezzo = prezzo;
        } else {
            System.out.println("Prezzo inserito non valido!");
        }
    }

    // IVA
    public BigDecimal GetIva() {
        return this.iva.multiply(BigDecimal.TEN.multiply(BigDecimal.TEN)).setScale(2, RoundingMode.DOWN);
    }

    public void SetIva(BigDecimal iva) {
        if (iva.compareTo(BigDecimal.ZERO) > 0 && iva != null) {
            this.iva = iva;
        } else {
            System.out.println("Iva inserita non valida!");
        }
    }

    public BigDecimal GetPrezzoIva() {
        if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

}
