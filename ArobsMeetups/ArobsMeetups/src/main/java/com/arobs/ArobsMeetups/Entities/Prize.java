package com.arobs.ArobsMeetups.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Prize")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Prize {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_prize")
    private int idPrize;

    @Column (name = "description", length = 2000)
    private String description;

    @Column (name = "value")
    @NotNull
    @Min(0)
    private double value;

}
