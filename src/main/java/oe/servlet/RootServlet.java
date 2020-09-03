package oe.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oe.guice.mythingy.MyThingy;

@Singleton
public class RootServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  private final MyThingy myThingy;

  @Inject
  public RootServlet(MyThingy myThingy) {
    this.myThingy = myThingy;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.getWriter().write(myThingy.getMessage());
  }

}
