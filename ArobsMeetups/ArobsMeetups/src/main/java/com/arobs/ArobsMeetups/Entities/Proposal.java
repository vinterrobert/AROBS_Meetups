package com.arobs.ArobsMeetups.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "proposal")
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Proposal {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_proposal")
    private int idProposal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "id_user", referencedColumnName = "id_user")
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
    @Min(0)
    @NonNull
    private int duration;

    @Column (name = "max_no_participants")
    @NotNull
    @Min(0)
    @NonNull
    private int maxNoParticipants;

    @OneToMany(mappedBy = "proposal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vote> votes = new ArrayList<>();

}
