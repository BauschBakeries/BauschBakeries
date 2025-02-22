package com.bauschbakeries.bauschbakeries_backend.repositories;

import com.bauschbakeries.bauschbakeries_backend.models.UserRoles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepo extends CrudRepository<UserRoles, Long> {
}
