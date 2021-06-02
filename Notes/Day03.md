02/06/2021

# Recap

- HTTP methods
    - GET
    - POST
    - PUT
    - DELETE
- Annotations
    - Primary
    - Qualifier
    - Autowired
    - Component
    - Scope
        - Singleton
        - Prototype
    - RestController
    - GetMapping
    - PostMapping
    - PutMapping
    - DeleteMapping
    - RequestMapping
- Setting up Postman
- Concepts of RESTful HTTP API
- We wrote a simple HTTP API
- Types of Injection
    - Constructor Injection
    - Setter Injection
    - Property Injection
- Scaling
    - Horizontal Scaling
    - Vertical Scaling
- APIs and Interfaces
- Industrial Programming


- Bloat
- Java is here for 25 years
- Spring is here for nearly 20 years

https://springframework.guru/


# HTTP (HyperText Transfer Protocol)

## Versions

- HTTP 1.0 1991
- HTTP 1.1 1999 but was upgraded in 2014
    - RFC 2616
    - RFC 7230-7235
- Websockets
    - This lets you stream videos
- HTTP 2.0 2016 Google
    - This is inbuilt

# HTTP Request

Path: /

```
GET / HTTP/1.1
Host: localhost:8080
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
Connection: keep-alive
Upgrade-Insecure-Requests: 1
Pragma: no-cache
Cache-Control: no-cache

Body
```

For Post Request

```
POST / HTTP/1.1
Host: localhost:8080
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate
Referer: http://localhost:8080/hello
Content-Type: application/x-www-form-urlencoded
Content-Length: 10
Origin: http://localhost:8080
Connection: keep-alive
Upgrade-Insecure-Requests: 1
Pragma: no-cache
Cache-Control: no-cache

name=Hello
```

# HTTP Response

```
HTTP/1.1 200 
Content-Type: text/html;charset=UTF-8
Content-Length: 12
Date: Wed, 02 Jun 2021 04:37:52 GMT
Keep-Alive: timeout=60
Connection: keep-alive

Hello World!
```




# URL

URL     https://localhost:8080/hello
Path    /hello

# HTTP Request Methods

- GET
- POST
- PUT
- Delete

# HTTP Response Status Codes

- 200
- 404 not found
- 500

# Demo for Request and Response

Timestamp: 10:24

## Path Variable

- These are get parameters

## Producing JSON Response

Timestamp: around 11:00

There are a lot of languages to communicate data

- Let's use JSON for communication between HTTP APIs

- JSON

```json
{
    "name":"Faiz"
}
```

- XML

```xml
<name>Faiz</name>
```

- YAML

```yml
-   name: Faiz
```

- protobuf



There is a library in spring which is called jackson. Jackson converts java objects into json and vice versa.

## Parse Request Body (only for JSON)

TimeStamp: 11:37

# Resources

https://developers.redhat.com/

# Story so far

- Handle HTTP Methods
- Handle HTTP Paths
- Handle Path Variables
- Handle Request Body
- Produce a HTTP Response Code
- Produce a Response Body