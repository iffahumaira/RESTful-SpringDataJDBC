package com.crudRepository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Id;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="foods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "menu")
    private String menu;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;
}
