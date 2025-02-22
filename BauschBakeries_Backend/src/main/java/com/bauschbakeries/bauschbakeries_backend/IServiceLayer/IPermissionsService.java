package com.bauschbakeries.bauschbakeries_backend.IServiceLayer;

import com.bauschbakeries.bauschbakeries_backend.repositories.PermissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IPermissionsService implements IPermissions {

    @Autowired
    private final PermissionsRepository permissionsRepo;

    public IPermissionsService(PermissionsRepository permissionsRepo) {
        this.permissionsRepo = permissionsRepo;
    }
}
