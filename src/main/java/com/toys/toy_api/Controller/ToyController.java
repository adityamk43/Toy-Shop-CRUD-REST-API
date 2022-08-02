package com.toys.toy_api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.toys.toy_api.Service.ToyService;
import com.toys.toy_api.Entities.Toy;

/* 
 * Author: Aditya Bhardwaj
 * Date Created: 02/08/2022
*/

@RestController
public class ToyController {
    
    @Autowired
    private ToyService toyService;

    //Rest API Handler for creating and inserting toy data into the database
    @PostMapping("/toy")
    public ResponseEntity<?> setToyData(@RequestBody Toy toy)
    {
        
        try {
            
            Toy savedToyData = this.toyService.setToyData(toy);
            
            return ResponseEntity.ok(savedToyData);
            
        } catch (Exception e) {

            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Saving Toy Data. Please Check the filled Data Once Again!!");
        }


    }

    //Rest API Handler for getting all the toy datas from the database
    @GetMapping("/toy")
    public ResponseEntity<?> getAllToyData()
    {
        List<Toy> allToyData = this.toyService.getAllToyData();

        if (allToyData.size() <= 0)
        {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Either there is no Data present in Database or there is some Internal Server Error. Sorry!! Please Try Again Later");
        }
        return ResponseEntity.ok(allToyData);
    }

    //Rest API Handler for getting single toy data of the given Toy ID
    @GetMapping("/toy/{toyId}")
    public ResponseEntity<?> getsingleToyData(@PathVariable("toyId") Integer toyId)
    { 
        
        try {
            
            Toy singleToyData = this.toyService.getSingleToyData(toyId);
            System.out.println(singleToyData);
            return ResponseEntity.ok(singleToyData);
            
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Getting Toy Data. Please Try Again Later!!");
        }
        
        
    }
    
    //Rest API Handler for deleting toy data of the given Toy ID
    @DeleteMapping("/toy/{toyId}")
    public ResponseEntity<?> deleteToyData(@PathVariable("toyId") Integer toyId)
    { 
        try {
            
            this.toyService.deleteToyData(toyId);
            return ResponseEntity.ok("Data Deleted Successfully");
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Deleting Data!! Please Try Again");
        }
        
    }

    //Rest API Handler for updating toy data of the given Toy ID
    @PutMapping("/toy/{toyId}")
    public ResponseEntity<?> updateToyData(@RequestBody Toy toy, @PathVariable("toyId") Integer toyId)
    { 
        try {
            Toy updatedToyData = this.toyService.updateToyData(toy, toyId);
            
            return ResponseEntity.ok(updatedToyData);
            
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Updating Data!! Please Try Again Later..");
        }

    }

    

}
