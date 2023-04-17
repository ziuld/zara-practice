
# README [![Awesome](https://cdn.jsdelivr.net/gh/sindresorhus/awesome@d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome#readme)
 A simple application to practice consult of prices in a store


## Install and Run

 Run app by Maven

    ./mvnw spring-boot:run

Run app by Docker

    docker build -t nameImage .

    docker run -dp 3000:7001 nameImage

Run Tests by mvn 
    
    mvn test

![Example Image](https://lh3.googleusercontent.com/fife/APg5EOYKK3xkmoG6l5RuUEeiGs-tPQxN6H4CT-Tl9wZ427V8PxhGuug_Lz8lJZ3gXm9krRAkOoW8VRY_Dk0SlOlkBBdj4cMoCYWcjDP5da1LealZb_0GJTEYXWSzETYlaKS6Xk-tJNsWiEucgX5nUznhJSFBAznO08GP66auyJ-6mqFWr-86LuEP-o1o07lQGuKMk3cy2wJjQhulb0MAyq8gsGE-eCM3LaRj4FQWAAWQeI9fptq6aIdqdO9zEy2M1WhgllGINt_G4u1haSOdjNB1BPhpWfYkjxKdNNXkfLbNwbMABrXzhthy-h6ewBKzK7bjXLUzPzW9Gp0W-nWII2EpIkUA_cAt0doG7tE0gUUjoM-KVs2TiJwLH6ezczIyPiCUfeKi3IXjibaSW0irrzuLXGry5tXIlm09pHtWCx4Mvafbrp-b1ddnTBcTYWRovk_iJzoKXsBALW3wrH_O4nS2q4oMZeChd_uCyqGw8cE6A7Hsu_M46vPy1JINqOtOJeojOID72lUBzohMKkK1FZf-HQ0ekfH9ieMVC7JXVoGltm8PwJQyTW4fQcyJAb6Sdxf_4E7kLTfwyjkLYoUKora6ngQJ52nbhXP1BxkXSnIF3EcSnxD9t2GkqtdCVXqKoIUZ3rI2BRieg3mtRliAFnL3ECc0iS13zEhn--zr9Wu56CrNiMdBCD99bI9OHblUbN1iTz89_5Vto3mkNaZZJwIWskq7X22w8jG74mzr6PjOsmEQRj88Wa2rVbuNbcv5gS19hGgf4KgvZTMiBXpn2EnevKfRKswJhYX7djNwPIQg4Mln1t-bVAuHclfS-zVRJQTp2SnU796qQySH484Yy8W8nKYgpGIHNrbFBIQqA4p3CCAwdM1I1C87ifY3JJ3V0UZkDkiDs9STIiWrgJepviwjYfY2V8yqv6nEW36NbQ0EbXtvh7abAtt3oHnMkTf3AuLchEYebU2-a-GEJ_8iYVpsarYzzriH76ZmPymQLvZIHQllEre7jBrHwCzSmGXsdbrTfyON4Pvv1AEe9zvM7Wh2BaoJEhkyAg_cUmwydNGo7Gnnfo5KFDS6y6jeK7DDqi9tV0TraazFHwMOTtrxVdy6zS8RDnvWu0s7hxWY7qEaOHc7L9cq5n8kxL2oEIRpEKBVXOfO4Ql0QUgd6mUx0fqxQ3qBxcgFbrZ1CZUPkZQZycX-7XbYto-519wZ7EWFoYEVSNy0L8y_yFw78O-fnmUCQLr4pL9e_kfPlpncWUOiTWFasY2Esu3GplP3xL-jL5MN3kyKk4OsldbhSDuZIKjJ2kQqP0misunJn5lGz33dgH7X6mGj9tkTRbr6LL16OxFn5hnqaBpR3kTfTlPQMuruolahvUyTau5B3Zjc-R0XoCBWwrrbGt2Rmq2cP_AjAOVMgOiPNfJhQoJQZuZiY_EU-VzPKcP29hG3pvS2mqADqUEmgC4MXU9nixG6aYEDHIGWD__WqZU8tJOIGU2bCTF3_bKHPJ6JBSK4ukpo8u0y1DIUBkhiaBM5g-_cvUv9rA=w1921-h881)


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
