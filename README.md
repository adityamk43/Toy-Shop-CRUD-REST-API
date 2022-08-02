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

For getting all the toys, use get Mapping

Endpoint -> http://localhost:8080/toy/

For getting single toy, use get Mapping

Endpoint -> http://localhost:8080/toy/{toyId}

For deleting a toy, use delete Mapping

Endpoint -> http://localhost:8080/toy/{toyId}

For updating a toy, use Put Mapping

Endpoint -> http://localhost:8080/toy/{toyId}

This will be the JSON Structure to update the data -> 

{
  "name": "Updated Toy Sample",
  "description": "New Toy for CRUD API Testing",
  "price": 499.99,
  "quantity": 2
}
