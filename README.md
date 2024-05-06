# Desenvolvimento de Serviços com Spring Boot [24E2_1]: TP1

Esse projeto foi teste de performance do bloco de Desenvolvimento de Serviços com Spring Boot do Instituto Infnet. 

## Exemplos dos Endpoints
### somar
GET http://localhost:8080/calculadora/somar?numero1=2&numero2=6

RESPONSE
```body
8.0
```

POST http://localhost:8080/calculadora/somar

REQUEST
```json
{
    "number1":2,
    "number2":6
}
```
RESPONSE
```body
8.0
```

### subtrair
GET http://localhost:8080/calculadora/subtrair?numero1=2&numero2=6

RESPONSE
```body
-4.0
```

POST http://localhost:8080/calculadora/subtrair

REQUEST
```json
{
    "number1":2,
    "number2":6
}
```
RESPONSE
```body
-4.0
```

### multiplicar
GET http://localhost:8080/calculadora/multiplicar?numero1=2&numero2=6

RESPONSE
```body
12.0
```

POST http://localhost:8080/calculadora/multiplicar

REQUEST
```json
{
    "number1":2,
    "number2":6
}
```
RESPONSE
```body
12.0
```

### dividir
GET http://localhost:8080/calculadora/dividir?numero1=2&numero2=6

RESPONSE
```body
0.3333333333333333
```

POST http://localhost:8080/calculadora/dividir

REQUEST
```json
{
    "number1":2,
    "number2":6
}
```
RESPONSE
```body
0.3333333333333333
```

### elevar
GET http://localhost:8080/calculadora/elevar?numero1=2&numero2=6

RESPONSE
```body
64.0
```

POST http://localhost:8080/calculadora/elevar

REQUEST
```json
{
    "number1":2,
    "number2":6
}
```
RESPONSE
```body
64.0
