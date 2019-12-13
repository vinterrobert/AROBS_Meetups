package com.arobs.ArobsMeetups.Services.Proposal;

import com.arobs.ArobsMeetups.Entities.User;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ProposalDto {

    @NonNull
    User idUser;

    @NonNull
    String title;

    @NonNull
    String type;

    @NonNull
    String difficulty;

    @NonNull
    String language;

    @NonNull
    String duration;

    @NonNull
    int maximumNumberOfPersons;

}
