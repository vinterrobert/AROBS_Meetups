package com.arobs.ArobsMeetups.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name = "Achievements_History")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AchievementsHistory {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_achievement_history")
    private int idEvent;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_prize", referencedColumnName = "id_prize")
    private Prize prize;

    @Column(name = "points")
    @NotNull
    @Min(0)
    private int points;

    @Column(name = "date_time")
    @NotNull
    private Date dateTime;

}
