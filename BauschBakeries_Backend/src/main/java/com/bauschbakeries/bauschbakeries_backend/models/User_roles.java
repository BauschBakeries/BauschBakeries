package com.bauschbakeries.bauschbakeries_backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Roles")
public class User_roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    private int roleId;
}
