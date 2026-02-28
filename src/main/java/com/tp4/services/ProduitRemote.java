package com.tp4.services;

import jakarta.ejb.Remote;

@Remote
public interface ProduitRemote {
    public String toString();
    public int getIdProduit();
    public void setIdProduit(int idProduit) ;
    public String getNomProduit() ;
    public void setNomProduit(String nomProduit) ;
    public double getPrixProduit() ;
    public void setPrixProduit(double prixProduit) ;
}
