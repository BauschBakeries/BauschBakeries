package com.bauschbakeries.bauschbakeries_backend.IServiceLayer;

import com.bauschbakeries.bauschbakeries_backend.repositories.OAuthAccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IAuthAccountsService implements IAuthAccounts {

    @Autowired
    private final OAuthAccountsRepository AuthAccountsRepo;

    public IAuthAccountsService(OAuthAccountsRepository AuthAccountsRepo) {
        this.AuthAccountsRepo = AuthAccountsRepo;
    }

}
