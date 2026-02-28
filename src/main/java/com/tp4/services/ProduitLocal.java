package com.tp4.services;

import jakarta.ejb.Local;

@Local
public interface ProduitLocal {
    public String toString();
    public int getIdProduit();
    public void setIdProduit(int idProduit) ;
    public String getNomProduit() ;
    public void setNomProduit(String nomProduit) ;
    public double getPrixProduit() ;
    public void setPrixProduit(double prixProduit) ;
}
