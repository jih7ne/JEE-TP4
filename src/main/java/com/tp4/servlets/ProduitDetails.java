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
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        PrintWriter out=resp.getWriter();
        out.println("ProduitService EJB is successfully injected");
        produitService.setNomProduit("Souris");
        try {
            Context context = new InitialContext();
            Object fObj=
                    context.lookup("java:global/demo-1.0-SNAPSHOT/ProduitService!com.tp4.services.ProduitService");

            produitService= (ProduitService) fObj;
        }catch(NamingException e) {
            System.out.println("Naming Exception has occuredwhen trying to lookup the FlightServiceEJB");
                    e.printStackTrace();
        }
    }
}


