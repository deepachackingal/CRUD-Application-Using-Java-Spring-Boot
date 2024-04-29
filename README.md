# Spring Boot, MySQL, Restful API Simple Application

A CRUD Restful API using Spring Boot with MySQL Database.

## Steps to Setup

### 1. Create MySQL Database

> CREATE DATABASE crud;

### 2. Change MySQL Username and Password

* Open `/crud/src/main/resources/application.properties`
* Change `spring.datasource.username` and `spring.datasource.password` as per your MySQL Credentials.

### 3. Start the application using Spring Boot Application as default:
 `/crud/src/main/java/com/saidul/crud/CrudApplication.java`

### 4. The App will start running at http://localhost:8080/

___

## Explore HTTP Methods:

| Http Methods | URL                                     |
| ------------ |-----------------------------------------|
| GET          | http://localhost:8080/api/products      |
| GET/{id}     | http://localhost:8080//apiproducts/{id} |
| POST         | http://localhost:8080/api/products      |
| PUT          | http://localhost:8080/api/products/{id} |
| DEL          | http://localhost:8080/api/products/{id} |

You can use them using a REST client such as Postman, Insomnia, etc.

Be careful to use the correct Id and remove the `{id}`. For example: 
> Put - http://localhost:8080/api/products/1

## How use:
### Here a Json data is give
### You can use any for the Create operation

```Json

  {
    "id": 1,
    "name": "Laptop",
    "quantityInStock": 50,
    "unitPrice": 999.99,
    "description": "A powerful laptop with high-performance specifications, suitable for professional use.",
    "category": 101,
    "manufacturedDate": "2023-01-15"
  }

```
---
`POST` : http://localhost:8080/api/products

Creating one or more products within the Database.


```Json




