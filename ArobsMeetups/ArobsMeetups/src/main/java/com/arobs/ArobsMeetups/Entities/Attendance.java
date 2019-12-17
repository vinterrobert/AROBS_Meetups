package com.arobs.ArobsMeetups.Entities;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "attendance", uniqueConstraints = @UniqueConstraint(columnNames={"id_user", "id_event"}))
@RequiredArgsConstructor
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @NotNull
    @NonNull
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_event", referencedColumnName = "id_event")
    @NotNull
    @NonNull
    private Event event;

    @Column (name = "vote")
    @NotNull
    @Min(0)
    @NonNull
    private int note;

    @Column (name = "comment", length = 2000)
    @NotNull
    @NonNull
    private String comment;

}
