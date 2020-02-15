Simplest (well, **very** simple) Spring Boot REST application featuring Swagger and H2 database.
Done after firs encounter with Spring JPA just for fun, do not expect anything fancy.

Swagger UI: [http://localhost:8080/swagger-ui]

H2:
* UI: [http://localhost:8080/h2-console]
* URL: jdbc:h2:mem:testdb
* credentials:
    * username sa
    * password sa
    
What can be done:
* adding person (via Swagger UI)
* querying person by id (via Swagger UI)
* querying database contents (via H2 console)

Adding person remember to keep JSON format (fortunately Swagger provides example).