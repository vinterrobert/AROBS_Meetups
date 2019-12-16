package com.arobs.ArobsMeetups.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name = "Event")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Event {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_event")
    private int idEvent;

    @OneToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;

    @Column (name = "title", length = 300)
    @NotNull
    private String title;

    @Column (name = "type", length = 100)
    @NotNull
    private String type;

    @Column (name = "difficulty", length = 100)
    @NotNull
    private String difficulty;

    @Column (name = "language", length = 100)
    @NotNull
    private String language;

    @Column (name = "duration")
    @NotNull
    @Min(0)
    private int duration;

    @Column (name = "max_no_participants")
    @NotNull
    @Min(0)
    private int maxNoParticipants;

    @Column (name = "room_name", length = 150)
    @NotNull
    private String roomName;

    @Column (name = "date_time")
    @NotNull
    private Date dateTime;



}
