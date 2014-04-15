Simple MVC Example (simplemvc)
===============================

This example demonstrates a simple mvc design pattern:
* Model (M) - backend services, e.g. `com.javaclinic.simplemvc.services.TimeService` interface and `com.javaclinic.simplemvc.services.TimeServiceImpl` implementation.
* View (V) - JSP view, e.g. `/WEB-INF/views/time.jsp`
* Controller (C) - servlet that controls the workflow, e.g. `com.javaclinic.simplemvc.web.TimeServlet`

== To build WAR

* `mvn package` - builds a war file, e.g. `target/simplemvc.war`

== To deploy WAR

* Just copy war file into your container deployment folder, e.g. `CATALINA_HOME/webapps/simplemvc.war`
