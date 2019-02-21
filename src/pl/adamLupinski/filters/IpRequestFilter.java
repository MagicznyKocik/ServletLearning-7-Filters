package pl.adamLupinski.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// annotation definition when not using xml definition
//@WebFilter(urlPatterns = "/*",
//        initParams = {@WebInitParam(name = "ipPattern", value = "192\\.168\\.1\\.[0-9]{1,3}")})
public class IpRequestFilter implements Filter {

    private String ipPattern;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
       String requestIp = req.getRemoteAddr();
        System.out.println("Ip filter " + requestIp);
        if (requestIp.matches(ipPattern)){
            System.out.println("IP OK");
            chain.doFilter(req,resp);
        } else {
            System.out.println("IP not ok");
            HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
            httpServletResponse.sendError(403);
        }
    }

    public void init(FilterConfig config) throws ServletException {

        ipPattern = config.getInitParameter("ipPattern");

    }

}
