package com.tp4.servlets;

import com.tp4.services.CounterStatefulBean;
import jakarta.ejb.EJB;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
    @EJB
    CounterStatefulBean cbStateful;
    public void sessionCreated(HttpSessionEvent event)  {
        HttpSession s = event.getSession();
        s.setAttribute("statefulBean", cbStateful);
    }
    public void sessionDestroyed(HttpSessionEvent event)  {}
    public SessionListener(){}
}
