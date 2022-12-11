package com.omeerdvrn.christmasDraw.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

@Table(name = "participants")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Participant {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "pair")
    private String pair;

    @Column(name = "drawID")
    private String drawID;
}
