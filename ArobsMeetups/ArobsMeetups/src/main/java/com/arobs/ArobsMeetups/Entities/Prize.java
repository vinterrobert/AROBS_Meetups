package com.arobs.ArobsMeetups.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "prize")
@RequiredArgsConstructor
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
    @NonNull
    private String description;

    @Column (name = "value")
    @NotNull
    @NonNull
    @Min(0)
    private double value;

    @OneToMany(mappedBy = "prize", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AchievementsHistory> achievementsHistories = new ArrayList<>();

}
