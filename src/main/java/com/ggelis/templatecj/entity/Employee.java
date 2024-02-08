package com.ggelis.templatecj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * Mapping information from database to domain class
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = -6661243404758411840L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Float amount;

    private boolean active;

}
