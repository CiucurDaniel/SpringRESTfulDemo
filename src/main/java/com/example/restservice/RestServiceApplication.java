package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
The main() method uses Spring Boot’s SpringApplication.run()
method to launch an application.

There is not a single line of XML or not even a web.xml file, either.
The we application is 100% pure Java and also because of Spring we did not have to
bother with any configuring and any plumbing or infrastructure.

How to run the application
If you use Gradle you can run by using "./gradlew bootRun"
Alternatively, you can build the JAR file by using ./gradlew build and then run the JAR file, as follows:
"java -jar build/libs/gs-rest-service-0.1.0.jar"

To test the service go to: http://localhost:8080/greeting
or http://localhost:8080/greeting?name=YourName

and you should be getting a Json response
 */

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }

}
