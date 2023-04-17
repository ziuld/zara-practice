
# README [![Awesome](https://cdn.jsdelivr.net/gh/sindresorhus/awesome@d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome#readme)
 A simple application to practice consult of prices in a store


## Install and Run

 Run app by Maven

    ./mvnw spring-boot:run

Run app by Docker

    docker build -t nameImage .

    docker run -dp 3000:7001 nameImage


## REST API

The REST API is part of a test an the app is described below.

#### Get specific price of a product in a date.

#### Request

`GET /api/prices/{date}/{product}/{Store}`

>Example : http://localhost:3000/api/prices/2020-06-14T10:00/35455/1

#### Response

    {
    "id": 1,
    "startDate": "2020-06-14T00:00:00",
    "endDate": "2020-12-31T23:59:00",
    "priceListId": 1,
    "productId": 35455,
    "priority": 0,
    "price": 35.50,
    "currency": "EUR"
}
