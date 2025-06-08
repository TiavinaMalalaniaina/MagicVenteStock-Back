package com.kili.magicventestock.metier.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_produit")
public class Produit {

    @Id
    private String reference;     
    private String libelle;
    private float prix;
    private boolean estDuJour;
    private int quantiteEnStock;

    public Produit() {}

    public Produit(String reference, String libelle, float prix, boolean estDuJour, int quantiteEnStock) {
        this.reference = reference;
        this.libelle = libelle;
        this.prix = prix;
        this.estDuJour = estDuJour;
        this.quantiteEnStock = quantiteEnStock;
    }

    // Getters et Setters
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public boolean isestDuJour() {
        return estDuJour;
    }

    public void setestDuJour(boolean estDuJour) {
        this.estDuJour = estDuJour;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }
}
