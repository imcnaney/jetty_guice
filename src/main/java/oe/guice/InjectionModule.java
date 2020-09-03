package oe.guice;

import com.google.inject.AbstractModule;

import oe.guice.mythingy.MyThingy;
import oe.guice.mythingy.MyThingyImpl;

/**
 * Regular dependency injection is configured here. There can be other modules as well, but they
 * have to be registered when setting up the injector in Server.java
 * 
 * @author ian
 *
 */
public class InjectionModule extends AbstractModule {

  protected void configure() {
    bind(MyThingy.class).to(MyThingyImpl.class);
  }

}
