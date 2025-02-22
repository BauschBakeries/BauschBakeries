package com.bauschbakeries.bauschbakeries_backend.services;

import com.bauschbakeries.bauschbakeries_backend.interfaces.IPermissions;
import com.bauschbakeries.bauschbakeries_backend.repositories.PermissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionsService implements IPermissions {

    @Autowired
    private final PermissionsRepository permissionsRepo;

    public PermissionsService(PermissionsRepository permissionsRepo) {
        this.permissionsRepo = permissionsRepo;
    }
}
