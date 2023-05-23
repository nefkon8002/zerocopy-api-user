# [Code challenge www.zerocopy.com( zerocopy-api-user )](https://www.zerocopylabs.com/)

## Back-end with Open Source Technologies

> Zero copy API User REST. 
>
> # Simple Developer Exercise

The savvy cats over at SMART Pump would like to be able to allow users to login to their account, check their balance and update their personal details. Write a simple web application (API and UI) using node.js and lowdb that lets users accomplish those tasks.

Feel free to use any other libraries or tool chains as long as the core code is javascript and node.js. npm (https://www.npmjs.org) is your friend - no need to recreate the wheel.

You will find the base data file in `/data`

Wireframes: `assets/wireframes.png`

## Time limits

This exercise is meant showcase your creativity and talent in problem solving against a real world scenario. To that end it should not consume your every waking moment. We recommend at max spending 3 evenings of time on the exercise.

## Requirements

* Login to the app via email and password
* Restrict access to valid a User
* Once logged in show the details of the user on the page
* Authorized users can check their account balance
* Allow the user to change their details
* lowdb (DB) -> https://github.com/typicode/lowdb
* node.js -> http://nodejs.org/

## Bonus Points

* Fully responsive UI
* Unit Tests of the API
* Functional Tests of the UI

## Estructure DATA 

>{
  "users": 
  [
    {
      "_id": "5410953eb0e0c0ae25608277",
      "guid": "eab0324c-75ef-49a1-9c49-be2d68f50b96",
      "isActive": true,
      "balance": "$3,585.69",
      "picture": "http://placehold.it/32x32",
      "age": 30,
      "eyeColor": "blue",
      "name": {
        "first": "Henderson",
        "last": "Briggs"
      },
      "company": "GEEKNET",
      "email": "henderson.briggs@geeknet.net",
      "password": "23derd*334",
      "phone": "+1 (936) 451-3590",
      "address": "121 National Drive, Cotopaxi, Michigan, 8240"
    },
    {
      "_id": "5410953eee9a5b30c3eea476",
      "guid": "b26ea5d1-d8db-4106-91a2-57f42a5c7e9e",
      "isActive": false,
      "balance": "$3,230.56",
      "picture": "http://placehold.it/32x32",
      "age": 30,
      "eyeColor": "brown",
      "name": {
        "first": "Boyd",
        "last": "Small"
      },
      "company": "ENDIPINE",
      "email": "boyd.small@endipine.biz",
      "password": "_4rhododfj",
      "phone": "+1 (814) 437-3837",
      "address": "261 Willow Street, Whipholt, Louisiana, 2879"
    },
    {
      "_id": "5410953ea3e25180277b2a40",
      "guid": "d5464d51-b4bf-4a4b-a5f7-fc2c8933ab45",
      "isActive": true,
      "balance": "$1,668.20",
      "picture": "http://placehold.it/32x32",
      "age": 33,
      "eyeColor": "green",
      "name": {
        "first": "Lott",
        "last": "Kramer"
      },
      "company": "POSHOME",
      "email": "lott.kramer@poshome.us",
      "password": "34oii+345",
      "phone": "+1 (983) 565-2711",
      "address": "743 Ryder Avenue, Marenisco, South Dakota, 4752"
    },
    {
      "_id": "5410953eada96439866e0a30",
      "guid": "5a98f752-22fe-499c-8288-ad0218c89552",
      "isActive": true,
      "balance": "$1,656.46",
      "picture": "http://placehold.it/32x32",
      "age": 35,
      "eyeColor": "brown",
      "name": {
        "first": "Gibson",
        "last": "Duke"
      },
      "company": "ZILLAR",
      "email": "gibson.duke@zillar.com",
      "password": "ndfadsf(d",
      "phone": "+1 (971) 473-2320",
      "address": "110 Roosevelt Place, Salunga, South Carolina, 9434"
    },
    {
      "_id": "5410953e099f716e02f32e05",
      "guid": "584de54b-fa74-480d-90a4-b1b38cd02685",
      "isActive": true,
      "balance": "$1,778.30",
      "picture": "http://placehold.it/32x32",
      "age": 23,
      "eyeColor": "green",
      "name": {
        "first": "Ruby",
        "last": "Glenn"
      },
      "company": "WATERBABY",
      "email": "ruby.glenn@waterbaby.co.uk",
      "password": "red^adl4",
      "phone": "+1 (800) 433-3997",
      "address": "622 Fanchon Place, Kohatk, Marshall Islands, 8665"
    }
  ]
}


## Estado del código

[![Heroku-zerocopy-api-user-CD](https://github.com/nefkon8002/zerocopy-api-user/actions/workflows/deploy-heroku.yml/badge.svg)](https://github.com/nefkon8002/zerocopy-api-user/actions/workflows/deploy-heroku.yml)

[![Spring-zerocopy-api-user-CI](https://github.com/nefkon8002/zerocopy-api-user/actions/workflows/test-sonar.yml/badge.svg)](https://github.com/nefkon8002/zerocopy-api-user/actions/workflows/test-sonar.yml)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=nefkon8002_zerocopy-api-user&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=nefkon8002_zerocopy-api-user)

[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/summary/new_code?id=nefkon8002_zerocopy-api-user)



## Tecnologías necesarias

`Java` `Maven` `GitHub` `Spring-boot` `Sonarcloud` `Heroku`

## ⚙️ Ejecución en local


2. Ejecutar el motor de MySQL: `//localhost:3306/tpv`

4. Ejecutar en consola: `mvn clean spring-boot:run`

* Cliente Web (OpenAPI): `http://localhost:8081/swagger-ui.html`

## 📖 Documentación del proyecto

[zerocopy-api-user: User](https://github.com/miw-upm/betca-tpv#back-end-user).
