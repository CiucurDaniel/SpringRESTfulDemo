package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/*
In Spring's approach to building RESTful web services, HTTP requests are
handled by a controller.

this components are identified by the @RestController annotation

@GetMapping annotation ensures that the HTTP GET requests are mapped to /greeting
are mapped to greeting() method

there are annotations for other HTTP verbs as well, like: @PostMapping

@Request param binds the value of the query string parameter "name" into the
"name" parameter of the "Greeting" object  with the "id" and "content" attributes
based on current counter value and formats given to name using the greeting template.

This code uses Spring @RestController annotation,
which marks the class as a controller where every method returns a domain object
instead of a view. It is shorthand for including both @Controller and @ResponseBody.
This is a key difference between a traditional MVC controller and the RESTful web service controller.

The Greeting object must be converted to JSON.
Thanks to Spring’s HTTP message converter support,
you need not do this conversion manually. Because Jackson 2 is on the classpath,
Spring’s MappingJackson2HttpMessageConverter is automatically chosen to convert
the Greeting instance to JSON.
 */

@RestController
public class GreetingController {
    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

