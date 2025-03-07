package com.example.miaprimaapplicazione;

public class Utente {
    //Attributi utente
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String dataNascita;

    //Costruttore utente
    Utente(String nome, String cognome, String email, String password, String dataNascita)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.dataNascita = dataNascita;
    }


    //Definizione dei metodi get per le proprietà

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
