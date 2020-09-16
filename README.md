# spring-rest-api-hibernate-hikaricp-tutorial

#### Hibernate features explained in [spring-mvc-hibernate-dbcp2-tutorial](https://github.com/seefa/spring-mvc-hibernate-dbcp2-tutorial) and Spring Core features mentioned in [spring-core-tutorial](https://github.com/seefa/spring-core-tutorial) codes in my repository

##### This tutorial uses _PagingAndSortingRepository_, _Pageable_ and _Page_ interfaces for fetching data with applying some limitations   

This tutorial code used to explain Spring with Hibernate for persistence layer and RESTful web services to call CRUD operations and HikariCP API for improvement database connection pool management by following tasks:

* add **spring-context**, **mysql-connector-java**, **spring-orm** **spring-webmvc** and dependencies
* add **javax.servlet-api** dependencies for implementing Java server-side.
* add **spring-data-jpa**, **hibernate-core**, **hibernate-entitymanager** and **hibernate-validator** dependencies for implementing Persistence ORM layer.
* add **HikariCP** and **hibernate-hikaricp** dependencies for supporting Database Connection Pool feature.
* using Entity bean to add new DAO object and using @Entity and @Table annotations plus @GeneratedValue for generating table key value automatically.
* support using **@RestController** and __@GetMapping__/__@PostMapping__/__@DeleteMapping__ annotations for HTTP requests(GET/POST/DELETE) to access CRUD services.
* using @InitBinder to convert String date input to java.util.Date format.
* using @PathVariable, @RequestParam, @RequestBody annotations in Controller class for getting REST requests params.
* using different **HttpStatus** for applying in Http Responses result(OK, CREATED, InternalServerError, NoContent and so on).

_TIP:_ Database DDL and DML SQL queries is added to **db_files** folder
