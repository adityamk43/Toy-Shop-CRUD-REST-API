package com.toys.toy_api.Service;

import java.util.List;

import com.toys.toy_api.Entities.Toy;

/* 
 * Author: Aditya Bhardwaj
 * Date Created: 02/08/2022
*/

public interface ToyService {
    
    Toy setToyData(Toy toy);

    List<Toy> getAllToyData();

    Toy getSingleToyData(Integer toyId);

    void deleteToyData(Integer toyId);

    Toy updateToyData(Toy toy, Integer toyId);
}
