package com.bauschbakeries.bauschbakeries_backend.IServiceLayer;

import com.bauschbakeries.bauschbakeries_backend.repositories.OAuthAccountsRepo;
import org.springframework.stereotype.Service;

@Service
public class IAuthAccountsService implements IAuthAccounts {
    private final OAuthAccountsRepo AuthAccountsRepo;

    public IAuthAccountsService(OAuthAccountsRepo AuthAccountsRepo) {
        this.AuthAccountsRepo = AuthAccountsRepo;
    }

}
