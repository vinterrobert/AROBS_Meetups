package com.arobs.ArobsMeetups.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "achievements_history")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AchievementsHistory {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_achievement_history")
    private int idEvent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @NotNull
    @NonNull
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_prize", referencedColumnName = "id_prize")
    @NotNull
    @NonNull
    private Prize prize;

    @Column(name = "points")
    @NotNull
    @Min(0)
    @NonNull
    private int points;

    @Column(name = "date_time")
    @NotNull
    @NonNull
    private Timestamp dateTime;

}
