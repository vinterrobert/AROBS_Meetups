package com.arobs.ArobsMeetups.Entities;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Attendance")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Attendance {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_attendance")
    private int idEvent;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_event", referencedColumnName = "id_event")
    private Event event;

    @Column (name = "vote")
    @NotNull
    @Min(0)
    private int note;

    @Column (name = "comment", length = 2000)
    @NotNull
    private String comment;

}
