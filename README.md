# SpringRESTfulDemo
A demo repository where I'm making a simple REST API with Java Spring. This repository follows the demo from Spring website: https://spring.io/guides/gs/rest-service/

## Steps

In order to create the REST Api you need to follow those steps:

* Create a Resource Representation Class -> Greeting.java
* Create a Resource Controller
* Finally just test the service -> http://localhost:8080/greeting and http://localhost:8080/greeting?name=YourName

## Additional information

If you go on the code you will that each file has a documentation so you can understand what is going on there.

## Final results

After you finish the above steps you can go to localhost and you will se the following responses:

**http://localhost:8080/greeting**

```
{
id: 5,
content: "Hello World!"
}
```

**http://localhost:8080/greeting?name=Dani**

```
{
id: 5,
content: "Hello Dani!"
}
```
