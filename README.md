# jetty_guice
Java server with embedded Jetty and Guice dependency injection.  This is intentionally as simple as possible, for use as a starting point for people (like me) who want something super simple yet powerful.

# Basics
see `./src/main/java/oe/server/OEServer.java` to see how it all ties together.

# To Run
`./gradlew runShadow`

Hit http://localhost:8100/ for the one and only API call, and to get a welcome message.

# To Extend
Add more servlet classes, and add their mappings to OEServletModule.  Feel free to rename that class, or break it up into several classes.  Just update OEServer (or your equivalent) accordingly.

As you add more injected dependencies you might want to break up InjectionModule into multiple modules.  Again just update OEServer (or your equivalent) accordingly.

# More notes about running
See [./notes/build.txt](./notes/build.txt)
