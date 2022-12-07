
# Spring Boot With JPA

This is a sample spring boot application with JPA. We can perform all CRUD operation.



## Tech Stack

Java, Spring Boot, Rest API


## Installation

Before running project make sure docker is installed.

Run my project with docker.

```bash
  docker-compose up
```
## Running Tests

To run tests, import the SpringBootDemo.postman_collection.json postman collection.
This contains all the CRUD operation API for testing.

## API Reference

#### Get all users

```http
  GET http://localhost:9090
```
Returns all user present in the database.

#### Save User

```http
  POST http://localhost:9090
```

Raw Data to be passed
```
{
    "id": 3,
    "name": "Tom"
}
```

Save user in the database.

#### Get User By Id

```http
  Get http://localhost:9090/{id}
```


| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `id`      | `integer`| **Required**. Your user id |


This takes user id and returns the user information if present in database. If not present then returns a message that user is not present.

#### Update User

```http
  Put http://localhost:9090
```
Raw data to be passed

```
{
    "id": 3,
    "name": "David"
}
```

This takes id and name values and update the user name.

#### Delete User

```http
  Delete http://localhost:9090/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `id`      | `integer`| **Required**. Your user id |

This deletes the user based on the id parameter.

## Screenshots

#### Save User
![Save User](Images/Save%20User.png)
#### Get All Users
![Get All Users](Images/Get%20All%20Users.png)
#### Get User By Id
![Get User By Id](Images/Get%20User%20By%20Id.png)
#### Update User
![Get All Users](Images/Get%20All%20Users.png)
#### Delete User
![Delete User](Images/Delete%20User.png)

## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)


## Authors

- [Vaibhav Singh](https://github.com/ivabby)

