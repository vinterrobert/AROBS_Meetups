package com.arobs.ArobsMeetups.Entities;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "User")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;

    @Column (name = "user_name", length = 100)
    @NotNull
    private String fullName;

    @Column (name = "role", length = 100)
    @NotNull
    private String role;

    @Column (name = "email", unique = true, length = 250)
    @NotNull
    private String email;

    @Column (name = "password", length = 100)
    @NotNull
    private String password;

    @Column (name = "points")
    @Min(0)
    @NotNull
    private int points;

}
