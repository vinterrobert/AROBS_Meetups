package com.arobs.ArobsMeetups.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "event")
@RequiredArgsConstructor
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
    @NotNull
    @NonNull
    private User user;

    @Column (name = "title", length = 300)
    @NotNull
    @NonNull
    private String title;

    @Column (name = "type", length = 100)
    @NotNull
    @NonNull
    private String type;

    @Column (name = "difficulty", length = 100)
    @NotNull
    @NonNull
    private String difficulty;

    @Column (name = "language", length = 100)
    @NotNull
    @NonNull
    private String language;

    @Column (name = "duration")
    @NotNull
    @NonNull
    @Min(0)
    private int duration;

    @Column (name = "max_no_participants")
    @NotNull
    @NonNull
    @Min(0)
    private int maxNoParticipants;

    @Column (name = "room_name", length = 150)
    @NotNull
    @NonNull
    private String roomName;

    @Column (name = "date_time")
    @NotNull
    @NonNull
    private Timestamp dateTime;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Attendance> attendances = new ArrayList<>();

}
