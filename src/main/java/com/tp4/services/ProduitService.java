package com.tp4.services;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import com.tp4.services.ProduitLocal;
import com.tp4.services.ProduitRemote;

@Stateless
public class ProduitService implements ProduitLocal, ProduitRemote {

    private int idProduit= 4;
    private String nomProduit = "Clavier";

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
