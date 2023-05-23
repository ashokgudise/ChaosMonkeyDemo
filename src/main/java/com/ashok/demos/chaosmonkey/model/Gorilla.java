package com.ashok.demos.chaosmonkey.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class Gorilla {
    @Id
    String id;

    @Column
    String name;

    @Column
    Timestamp modified;
}
