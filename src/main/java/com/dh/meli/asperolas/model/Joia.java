package com.dh.meli.asperolas.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_joias")
public class Joia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 200, nullable = false)
    private String material;

    @Column(nullable = false)
    private Double peso;

    @Column(nullable = false)
    private Integer quilates;
}
