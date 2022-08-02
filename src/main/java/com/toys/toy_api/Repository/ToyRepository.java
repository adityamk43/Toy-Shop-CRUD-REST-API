package com.toys.toy_api.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.toys.toy_api.Entities.Toy;

/* 
 * Author: Aditya Bhardwaj
 * Date Created: 02/08/2022
*/

@Repository
public interface ToyRepository extends CrudRepository<Toy, Integer>{
    
}
