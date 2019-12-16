package com.arobs.ArobsMeetups.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "Vote")
@AllArgsConstructor
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

    @OneToOne
    @JoinColumn (name = "id_user", referencedColumnName = "id_user")
    @NotNull
    private User user;

    @OneToOne
    @JoinColumn (name = "id_proposal", referencedColumnName = "id_proposal")
    @NotNull
    private Proposal proposal;

}
