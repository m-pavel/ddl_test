package com.example.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "entity")
public class Entity {
    @Column(name = "status")
    private Status status;
}
