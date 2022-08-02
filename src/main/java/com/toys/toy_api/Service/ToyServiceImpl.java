package com.toys.toy_api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toys.toy_api.Repository.ToyRepository;
import com.toys.toy_api.Entities.Toy;

/* 
 * Author: Aditya Bhardwaj
 * Date Created: 02/08/2022
*/

@Service
public class ToyServiceImpl implements ToyService {

    @Autowired
    private ToyRepository toyRepository;

    //Method for creating a new Toy
    @Override
    public Toy setToyData(Toy toy) {
        
        toy.setTotalPrice(toy.getPrice()*toy.getQuantity());
        Toy savedToy = this.toyRepository.save(toy);
        
        return savedToy;
    }

    //Method for getting all toys
    @Override
    public List<Toy> getAllToyData() {
        
        List<Toy> toysList = (List<Toy>) this.toyRepository.findAll();

        return toysList;
    }

    //Method for getting a single data toy from given toy Id
    @Override
    public Toy getSingleToyData(Integer toyId) {

        Optional<Toy> OptionalToy = this.toyRepository.findById(toyId);

        Toy toy = OptionalToy.get();
        
        return toy;
    }
    
    //Deleting Toy Data using given Toy ID
    @Override
    public void deleteToyData(Integer toyId) {

        this.toyRepository.deleteById(toyId);

    }

    //Updating Toy data using given toy data and toy ID
    @Override
    public Toy updateToyData(Toy toy, Integer toyId) {

        toy.setToyId(toyId);
        toy.setTotalPrice(toy.getPrice()*toy.getQuantity());

        Toy updatedToy = this.toyRepository.save(toy);

        return updatedToy;
    }
    
}
