package com.toys.toy_api.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* 
 * Author: Aditya Bhardwaj
 * Date Created: 02/08/2022
*/

@Entity
@Table(name = "toys")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Toy {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer toyId;

    private String name;

    private String description;

    private Float price;

    private Integer quantity;

    private Float totalPrice;


}
