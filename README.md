# Simple Spring Example (simplespring)

This simple example demonstrates Spring container, i.e. `org.springframework.beans.factory.BeanFactory`
* Spring container is configured by `src/java/resources/applicationContext.xml` Spring configuration file.
* Spring container instantiates `com.javaclinic.simplespring.services.TimeServiceImpl`.
* Application asks for a service instance from Spring container.
* Application calls the service instance.

## Build JAR

* `mvn package` - builds a jar file, e.g. `target/simplespring.jar`

## Run example

* `mvn exec:java`
