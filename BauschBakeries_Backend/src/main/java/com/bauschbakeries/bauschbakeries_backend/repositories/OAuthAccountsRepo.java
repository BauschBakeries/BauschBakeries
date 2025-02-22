package com.bauschbakeries.bauschbakeries_backend.repositories;

import com.bauschbakeries.bauschbakeries_backend.models.OAuthAccounts;
import org.springframework.data.repository.CrudRepository;

public interface OAuthAccountsRepo extends CrudRepository<OAuthAccounts, Integer> {
}
