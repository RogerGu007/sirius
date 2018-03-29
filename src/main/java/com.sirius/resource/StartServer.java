package com.sirius.resource;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.spi.container.servlet.ServletContainer;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;


public class StartServer {
    public static void main(String[] args) {
        Server server = new Server(8090);
        ServletHolder sh = new ServletHolder(ServletContainer.class);
        sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", PackagesResourceConfig.class.getCanonicalName());
        sh.setInitParameter("com.sun.jersey.config.property.packages", "com.sirius");
        //start server
        Context context = new Context(server, null);
        context.addServlet(sh, "/sirius/service/*");
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}