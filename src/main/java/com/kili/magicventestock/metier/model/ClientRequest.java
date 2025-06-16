package com.kili.magicventestock.metier.model;

public class ClientRequest {
    private String pseudo;
    private String motDePasse;

    public ClientRequest() {
    }

    public ClientRequest(String pseudo, String motDePasse) {
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
    }

    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }



}
