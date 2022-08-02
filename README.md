# Toy-Shop-CRUD-REST-API

This is a short project for CRUD REST API for a TOY Shop

For creating a new Toy, use Post Mapping

Endpoint -> http://localhost:8080/toy/

This will be the JSON Structure to submit the data -> 

{
  "name": "Toy",
  "description": "New Toy for CRUD API Testing",
  "price": 99.99,
  "quantity": 2
}

OUTPUT:

{
    "toyId": 12,
    "name": "Toy",
    "description": "New Toy for Delete Testing",
    "price": 99.9,
    "quantity": 2,
    "totalPrice": 199.8
}




For getting all the toys, use get Mapping

Endpoint -> http://localhost:8080/toy/

OUTPUT:

[
    {
        "toyId": 2,
        "name": "Remote Control Car",
        "description": "New Remote Control Car with offroad capability",
        "price": 500.0,
        "quantity": 3,
        "totalPrice": 1500.0
    },
    {
        "toyId": 3,
        "name": "Teddy Bear",
        "description": "New Fluffy Large Size White Teddy Bear",
        "price": 800.0,
        "quantity": 2,
        "totalPrice": 1600.0
    },
    {
        "toyId": 4,
        "name": "Buzz LightYear",
        "description": "Action Figure from Toy Story",
        "price": 1200.0,
        "quantity": 4,
        "totalPrice": 4800.0
    },
    {
        "toyId": 5,
        "name": "Nerf Gun",
        "description": "Unbox, Build, Load and Shoot!!",
        "price": 1999.99,
        "quantity": 10,
        "totalPrice": 19999.9
    }
]




For getting single toy, use get Mapping

Endpoint -> http://localhost:8080/toy/{toyId}

OUTPUT:

{
    "toyId": 2,
    "name": "Remote Control Car",
    "description": "New Remote Control Car with offroad capability",
    "price": 500.0,
    "quantity": 3,
    "totalPrice": 1500.0
}



For deleting a toy, use delete Mapping

Endpoint -> http://localhost:8080/toy/{toyId}

OUTPUT:

Data Deleted Successfully




For updating a toy, use Put Mapping

Endpoint -> http://localhost:8080/toy/{toyId}

This will be the JSON Structure to update the data -> 

{
  "name": "Updated Toy Sample",
  "description": "New Toy for CRUD API Testing",
  "price": 499.99,
  "quantity": 2
}


OUTPUT:

{
    "toyId": 16,
    "name": "Updated Toy Sample",
    "description": "New Toy for CRUD API Testing",
    "price": 499.9,
    "quantity": 2,
    "totalPrice": 999.8
}
