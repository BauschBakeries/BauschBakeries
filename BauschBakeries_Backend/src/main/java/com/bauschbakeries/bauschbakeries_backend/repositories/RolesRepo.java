package com.bauschbakeries.bauschbakeries_backend.repositories;

import com.bauschbakeries.bauschbakeries_backend.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepo extends JpaRepository<Roles, Long> {
}
