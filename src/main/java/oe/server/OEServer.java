package oe.server;

import java.util.EnumSet;

import javax.servlet.DispatcherType;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceFilter;

import oe.guice.InjectionModule;
import oe.guice.OEServletModule;

public class OEServer {

  private static final int port = 8100;

  public static void main(String[] args) throws Exception {
    // must initialize injector before creating the server!
    InjectionModule im = new InjectionModule();
    OEServletModule sm = new OEServletModule();
    @SuppressWarnings("unused")
    Injector injector = Guice.createInjector(im, sm);

    Server server = new Server(port);
    ServletContextHandler servletContextHandler =
        new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
    servletContextHandler.addFilter(GuiceFilter.class, "/*", EnumSet.allOf(DispatcherType.class));

    // Start the server
    System.out.println("Listening on port " + port);
    server.start();

    // Wait until the server exits
    server.join();
  }

}
