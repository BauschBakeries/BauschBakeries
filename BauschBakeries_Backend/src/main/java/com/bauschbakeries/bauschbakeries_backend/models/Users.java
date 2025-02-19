package com.bauschbakeries.bauschbakeries_backend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private int userId;

    private String firstName;
    private String lastName;

    private String email;

}
