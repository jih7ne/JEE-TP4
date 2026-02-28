package com.tp4.servlets;

import com.tp4.services.ProduitService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet("/details")
public class ProduitDetails extends HttpServlet {
    @EJB
    private ProduitService produitService;
    @EJB
    private ProduitService produitService2;
    @EJB
    private ProduitService produitService3;
    @EJB
    private ProduitService produitService4;
    @EJB
    private ProduitService produitService5;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        PrintWriter out=resp.getWriter();
        out.println("ProduitService EJB is successfully injected");
        produitService.setNomProduit("Souris");
        out.println("Nom : " + produitService.getNomProduit());
        produitService.setNomProduit("Clavier");
        out.println("Nom : " + produitService2.getNomProduit());
        produitService.setNomProduit("Ecran");
        out.println("Nom : " + produitService3.getNomProduit());
        produitService.setNomProduit("GPU");
        out.println("Nom : " + produitService4.getNomProduit());
        produitService.setNomProduit("RAM");
        out.println("Nom : " + produitService5.getNomProduit());
    }
}


