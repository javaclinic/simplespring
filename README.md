# Simple Spring Example (simplespring)

This simple example demonstrates Spring container, i.e. `org.springframework.beans.factory.BeanFactory`
* Spring container is configured by `src/java/resources/applicationContext.xml` Spring configuration file.
* Spring container instantiates `example.services.TimeServiceImpl`.
* Application asks for a service instance from Spring container.
* Application calls the service instance.

## Build JAR

* `mvn package` - builds a jar file, e.g. `target/simplespring.jar`

## Run example

* `mvn exec:java` - runs the application, with `exec.mainClass` specified in `pom.xml`
* `mvn exec:java -Dexec.mainClass="example.run.SimpleSpringExample"` - runs the application

## Import project to Eclipse
1. Right click in your Project Explorer
2. Select `Import...`
3. Select `Maven`
4. Select `Check out Maven Projects from SCM`
5. Select SCM URL as `git` and type in `https://github.com/javaclinic/simplespring.git`
6. Select `Finish`
7. Right click on newly created project, e.g. `simplespring`
8. Select `Maven`
9. Select `Update Project ... ALT+F5`
10. Select `OK`

## Run example in Eclipse
1. Right click on `example.run.SimpleSpringExample`
2. Select `Run As`
3. Select `Java Application`
