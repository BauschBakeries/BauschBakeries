package com.bauschbakeries.bauschbakeries_backend.services;

import com.bauschbakeries.bauschbakeries_backend.interfaces.IAuthAccounts;
import com.bauschbakeries.bauschbakeries_backend.repositories.OAuthAccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthAccountsService implements IAuthAccounts {

    @Autowired
    private final OAuthAccountsRepository AuthAccountsRepo;

    public AuthAccountsService(OAuthAccountsRepository AuthAccountsRepo) {
        this.AuthAccountsRepo = AuthAccountsRepo;
    }

}
