package com.example.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "entity")
public class Entity {
    @Id
    @Column(name = "status")
    private Status status;
}
