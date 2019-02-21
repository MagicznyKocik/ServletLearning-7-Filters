package pl.adamLupinski.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
// annotation definition when not using xml definition
//@WebFilter(urlPatterns = "/admin.jsp")
public class AuthenticationFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Authentication filter");
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
        //  getting session if it is open, false parameter prevents from starting new session
        HttpSession session = httpServletRequest.getSession(false);
        // checking if usser is looged in
        if(session!= null && session.getAttribute("username") != null){
            System.out.println("Session + user valid");
            chain.doFilter(req, resp);
        } else {
            System.out.println("Session or user invalid");
            HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
            httpServletResponse.sendRedirect("login.jsp");
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
