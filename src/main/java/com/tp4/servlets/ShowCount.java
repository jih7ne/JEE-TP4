package com.tp4.servlets;

import com.tp4.services.CounterBean;
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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        PrintWriter out=resp.getWriter();
        out.println("The count value is: " + cb.getCounter());
    }
    public ShowCount(){
        super();
    }
}
