package com.demo.springboot.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class User {
    @Id
    private int id;

    private String name;

    @OneToOne(cascade = {CascadeType.ALL})
    private Address address;


}
