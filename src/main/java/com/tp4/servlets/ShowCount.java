package com.tp4.servlets;

import com.tp4.services.CounterBean;
import com.tp4.services.CounterStatefulBean;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ShowCount")
    public class ShowCount extends HttpServlet {
        @EJB
        CounterBean cb;
        @EJB
        CounterStatefulBean cbStateful;
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
                ServletException, IOException {
            PrintWriter out=resp.getWriter();
            out.println("The count value of the SINGLETON Bean is: " + cb.getCounter());
            out.println("The count value of the STATEFUL Bean is: " +
                    cbStateful.getCounter());
        }

    public ShowCount(){
        super();
    }
}
