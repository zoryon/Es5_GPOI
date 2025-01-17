package com.example;

public class Persona {
    // attributi
    private String nome;
    private String cognome;
    private String codiceFiscale;

    /**
     * Costruttore di default
     * @param nome
     * @param cognome
     * @param codiceFiscale
     */
    public Persona(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public Persona() {
        this.nome = "";
        this.cognome = "";
        this.codiceFiscale = "";
    }

    // getter & setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    // metodi

}
