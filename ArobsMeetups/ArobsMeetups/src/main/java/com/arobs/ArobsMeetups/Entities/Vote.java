package com.arobs.ArobsMeetups.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "vote", uniqueConstraints = @UniqueConstraint(columnNames={"id_user", "id_proposal"}))
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Vote {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_vote")
    private int idVote;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "id_user", referencedColumnName = "id_user")
    @NotNull
    @NonNull
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "id_proposal", referencedColumnName = "id_proposal")
    @NotNull
    @NonNull
    private Proposal proposal;

}
