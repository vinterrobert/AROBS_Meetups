package com.arobs.ArobsMeetups.Services.User;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserDto {

    @NonNull
    String fullName;

    @NonNull
    String role;

    @NonNull
    String email;

    @NonNull
    String password;

    @NonNull
    int points;

}
