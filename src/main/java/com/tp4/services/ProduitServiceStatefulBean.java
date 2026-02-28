package com.tp4.services;

import jakarta.ejb.Stateful;

@Stateful (name = "ProduitStateful")
public class ProduitServiceStatefulBean implements ProduitLocal{

    private int idProduit= 4;
    private String nomProduit = "Sourisatus";

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }

    @Override
    public String toString() {
        return "ProduitService{" +
                "idProduit=" + idProduit +
                ", nomProduit='" + nomProduit + '\'' +
                ", prixProduit=" + prixProduit +
                '}';
    }

    private double prixProduit = 50;
}
