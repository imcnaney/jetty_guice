package oe.guice;

import com.google.inject.servlet.ServletModule;

import oe.servlet.RootServlet;

/** All URL bindings are configured here */
public class OEServletModule extends ServletModule {

  @Override
  protected void configureServlets() {
    bind(RootServlet.class);

    serve("/hello").with(RootServlet.class);
    serve("/*").with(RootServlet.class);
  }

}
