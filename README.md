# Inico de Proyecto Personal de eCommerce[^1].

Inicio del Proyecto 
## Consideraciones
## Dependencias
 - Spring Web
 - Spring Boot DevTools
 - Spring Data JPA
 - Thymeleaf
 - MySQL Driver
## Cosas a investigar
- Hibernate: 
- ORM:
 
## [^1]: Inicio de Proyecto
Al inicio de un proyecto con el framework Spring con la herramienta SpringBoot, al querer ejecutar el proyecto de 0 va a producir un error porque se intenta conectar a una base de datos que no existe. 

### Para ello coloco estas sentencias al `resources/application.properties`:
```java
spring.datasource.url=jdbc:mysql://localhost:3306/pa_db?createDatabaseIfNotExist=true
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.datasource.usernamespring.datasource.password=admin
spring.jpa.show-sql=true
```

```java
spring.datasource.url=jdbc:mysql://localhost:3306/pa_db?createDatabaseIfNotExist=true
```

   - `jdbc:mysql`: protocolo de conexión para bases de datos MySQL. 
   - `localhost:3306`: el proyecto se va a poder acceder desde el localhost en el puerto 3306
   - `pa_db`: nombre de la base de datos
   - `createDatabaseIfNotExist=true`: Si la base de datos no está creada se crea automáticamente 
```java
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
- `com.mysql.cj`: paquete para el Connector/J de MySQL. MySQL lanzó el Connector/J para facilitar la interacción entre aplicaciones Java y bases de datos MySQL.
- `jdbc`: (Java DataBase Conecction) Paquete estándar de Java para interactuar con bases de datos relacionales. Puente entre Java y la DB
- `Driver`: la clase que implementa la interfaz JDBC en Java y permite la conexión. Los métodos realizados en el código Java son traducidos en sentencias SQL por el driver de la base de datos.

```java
spring.jpa.hibernate.ddl-auto=update
```
   Forma en que Hibernate maneja el esquema de la base de datos. 

- `update`: indica que Hibernate actualizará automáticamente la estructura de la base de datos para que coincida con las entidades Java.
   Otras posibilidades
   - `validate`: Verifica si el esquema coincide con las entidades, pero no hace cambios.
   - `create`: Crea un nuevo esquema cada vez que se inicia la aplicación.
   - `create-drop`: Crea el esquema al inicio y lo elimina al final.
   - `none>` No realiza ninguna acción sobre el esquema de la base de datos.
```java
spring.datasource.username=root 
```
- `root`: usuario por defecto de MySQL
```java
spring.datasource.password=admin
```
- `admin`: contraseña por defecto de MySQL 
```java
spring.jpa.show-sql=true
```
- habilita la visualización de las consultas SQL que Hibernate genera y ejecuta en la consola.

# Model

## Estructura
   Clases:
    -  User
    -  Product
    -  Order
    -  OrderDetail
