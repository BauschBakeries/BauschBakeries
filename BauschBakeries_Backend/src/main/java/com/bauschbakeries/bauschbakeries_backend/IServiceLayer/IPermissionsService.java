package com.bauschbakeries.bauschbakeries_backend.IServiceLayer;

import com.bauschbakeries.bauschbakeries_backend.repositories.PermissionsRepository;
import org.springframework.stereotype.Service;

@Service
public class IPermissionsService implements IPermissions {
    private final PermissionsRepository permissionsRepo;

    public IPermissionsService(PermissionsRepository permissionsRepo) {
        this.permissionsRepo = permissionsRepo;
    }
}
