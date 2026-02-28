package com.tp4.servlets;

import com.tp4.services.ProduitLocal;
import com.tp4.services.ProduitRemote;
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
public class ProduitDetails extends HttpServlet{
    @EJB(beanName = "ProduitStateful")
    private ProduitLocal produitServiceStateful;
    @EJB(beanName = "ProduitStateless")
    private ProduitLocal produitServiceStateless;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        PrintWriter out=resp.getWriter();
        if(produitServiceStateful != null || produitServiceStateless != null) {
            out.println("ProduitService EJB is successfully injected");
            out.println("Product detail Stateful : " +
                    produitServiceStateful.getNomProduit());
            out.println("Product detail Stateless : " +
                    produitServiceStateless.getNomProduit());
        }else{
            out.println("Product service EJB is not injected");
        }
    }}
