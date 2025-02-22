package com.bauschbakeries.bauschbakeries_backend.repository;

import com.bauschbakeries.bauschbakeries_backend.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String Username);

    Optional<Users> findByEmail(String Email);
}