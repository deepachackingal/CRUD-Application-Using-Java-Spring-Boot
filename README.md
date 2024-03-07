# Spring Boot, MySQL, Restful API Simple Application

A CRUD Restful API using Spring Boot with MySQL Database.

## Steps to Setup

### 1. Create MySQL Database

> CREATE DATABASE crud;

### 2. Change MySQL Username and Password

* Open `/crud/src/main/resources/application.properties`
* Change `spring.datasource.username` and `spring.datasource.password` as per your MySQL Credentials.

### 3. Start the application using Spring Boot Application as default:
 `/crud/src/main/java/dev/patricksilva/crud/CrudApplication.java`

### 4. The App will start running at http://localhost:7070/

___

## Explore HTTP Methods:

| Http Methods | URL                                 |
| ------------ |-------------------------------------|
| GET          | http://localhost:7070/products      |
| GET/{id}     | http://localhost:7070/products/{id} |
| POST         | http://localhost:7070/products      |
| PUT          | http://localhost:7070/products/{id} |
| DEL          | http://localhost:7070/products/{id} |

You can use them using a REST client such as Postman, Insomnia, etc.

Be careful to use the correct Id and remove the `{id}`. For example: 
> Put - http://localhost:7070/products/1

## How use:
### Here a Json data is give
### You can use any for the Create operation

```Json
[
  {
    "id": 1,
    "name": "Laptop",
    "quantityInStock": 50,
    "unitPrice": 999.99,
    "description": "A powerful laptop with high-performance specifications, suitable for professional use.",
    "category": 101,
    "manufacturedDate": "2023-01-15"
  },
  {
    "id": 2,
    "name": "T-shirt",
    "quantityInStock": 100,
    "unitPrice": 19.99,
    "description": "A comfortable cotton T-shirt with a classic design, available in various colors and sizes.",
    "category": 201,
    "manufacturedDate": "2023-02-20"
  },
  {
    "id": 3,
    "name": "Headphones",
    "quantityInStock": 30,
    "unitPrice": 49.99,
    "description": "Wireless headphones with noise-canceling feature, delivering high-quality sound.",
    "category": 101,
    "manufacturedDate": "2023-03-10"
  }
]

```
---
`POST` : http://localhost:7070/products

Creating one or more products within the Database.

Body:

```Json
{
    "id": 2,
    "name": "T-shirt",
    "quantityInStock": 100,
    "unitPrice": 19.99,
    "description": "A comfortable cotton T-shirt with a classic design, available in various colors and sizes.",
    "category": 201,
    "manufacturedDate": "2023-02-20"
}
```
___

`GET` : http://localhost:7070/products

Getting all products from the Database.

Body Return:

```Json
{
    "id": 2,
    "name": "T-shirt",
    "quantityInStock": 100,
    "unitPrice": 19.99,
    "description": "A comfortable cotton T-shirt with a classic design, available in various colors and sizes.",
    "category": 201,
    "manufacturedDate": "2023-02-20"
}
```
___

`GET/{id}` : http://localhost:7070/products/2

Getting a product by ID from the Database.

Body Return:

```Json
{
    "id": 2,
    "name": "T-shirt",
    "quantityInStock": 100,
    "unitPrice": 19.99,
    "description": "A comfortable cotton T-shirt with a classic design, available in various colors and sizes.",
    "category": 201,
    "manufacturedDate": "2023-02-20"
}
```
___

`PUT/{id}` : http://localhost:7070/products/2

Updating a product by Id.

Body: 

```Json
{
    "name": "Laptop",
    "quantityInStock": 50,
    "unitPrice": 999.99,
    "description": "A powerful laptop with high-performance specifications, suitable for professional use.",
    "category": 101,
    "manufacturedDate": "2023-01-15"
}
```
___

`DEL/{id}` : http://localhost:7070/products/2

Deleting a product. This should return an Http Status 204.

Body: 

```Json
[]                                              204 No Content
```
___



