package com.bauschbakeries.bauschbakeries_backend.services;

import com.bauschbakeries.bauschbakeries_backend.models.Users;

import java.util.Optional;

public interface UserInterface {
    Optional<Users> findByUsername(String Username);

    Optional<Users> findByEmail(String Email);
}
