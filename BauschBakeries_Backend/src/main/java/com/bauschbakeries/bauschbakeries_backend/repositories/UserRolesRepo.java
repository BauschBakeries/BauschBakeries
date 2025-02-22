package com.bauschbakeries.bauschbakeries_backend.repositories;

import com.bauschbakeries.bauschbakeries_backend.models.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepo extends JpaRepository<UserRoles, Long> {
}
