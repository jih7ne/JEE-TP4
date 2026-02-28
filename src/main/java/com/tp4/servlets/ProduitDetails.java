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
public class ProduitDetails extends HttpServlet
{
    @EJB(beanName= "ProduitStateful")
    private ProduitLocal produitServiceStateful;
    @EJB(beanName= "ProduitStateful")
    private ProduitLocal produitServiceStateful2;
    @EJB(beanName= "ProduitStateless")
    private ProduitLocal produitServiceStateless;
    @EJB(beanName= "ProduitStateless")
    private ProduitLocal produitServiceStateless2;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        PrintWriter out=resp.getWriter();
        try {
            Context context = new InitialContext();
            Object fsObject = context.lookup("java:app/demo-1.0-SNAPSHOT/ProduitStateless!com.tp4.services.ProduitLocal");
            this.produitServiceStateless = (ProduitLocal) fsObject;
            Object fsStatefulObject = context.lookup("java:app/demo-1.0-SNAPSHOT/ProduitStateful!com.tp4.services.ProduitLocal");
            this.produitServiceStateful = (ProduitLocal) fsStatefulObject;
        }catch(NamingException e) {
            System.out.println("Naming exception has occured in the lookup of our ProduitService EJBs");
                    e.printStackTrace();
        }
        out.println("ProduitService EJB is successfully injected");
        out.println("Product detail Stateful : " +
                produitServiceStateful.getNomProduit());
        out.println("Product detail Stateless : " +
                produitServiceStateless.getNomProduit());
    }
}