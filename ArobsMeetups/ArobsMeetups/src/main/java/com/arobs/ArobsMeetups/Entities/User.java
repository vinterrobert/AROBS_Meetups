package com.arobs.ArobsMeetups.Entities;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "user")
@NoArgsConstructor
@RequiredArgsConstructor
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
    @NonNull
    private String fullName;

    @Column (name = "role", length = 100)
    @NotNull
    @NonNull
    private String role;

    @Column (name = "email", unique = true, length = 250)
    @NotNull
    @NonNull
    private String email;

    @Column (name = "password", length = 100)
    @NotNull
    @NonNull
    private String password;

    @Column (name = "points")
    @Min(0)
    @NotNull
    @NonNull
    private int points;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Proposal> proposals = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vote> votes = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Attendance> attendances = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AchievementsHistory> achievementsHistories = new ArrayList<>();




}
