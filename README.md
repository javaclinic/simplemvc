# Simple MVC Example (simplemvc)

This example demonstrates a simple Web application that implements a Model-View-Controller (MVC) design pattern:
* Model (M) - backend services, e.g. `com.javaclinic.simplemvc.services.TimeService` interface and `com.javaclinic.simplemvc.services.TimeServiceImpl` implementation.
* View (V) - JSP view, e.g. `/WEB-INF/views/time.jsp`
* Controller (C) - servlet that controls the workflow, e.g. `com.javaclinic.simplemvc.web.TimeServlet`

## Build WAR

* `mvn package` - builds a war file, e.g. `target/simplemvc.war`

## Deploy WAR

* Copy war file into your container deployment folder, e.g. `CATALINA_HOME/webapps/simplemvc.war`

## Import project to Eclipse
1. Right click in your Project Explorer
2. Select `Import...`
3. Select `Maven`
4. Select `Check out Maven Projects from SCM`
5. Select SCM URL as `git` and type in `https://github.com/javaclinic/simplemvc.git`
6. Select `Finish`

