package com.bauschbakeries.bauschbakeries_backend.repositories;

import com.bauschbakeries.bauschbakeries_backend.models.OAuthAccounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OAuthAccountsRepo extends JpaRepository<OAuthAccounts, Long> {
}
