package com.bauschbakeries.bauschbakeries_backend.IServiceLayer;

import com.bauschbakeries.bauschbakeries_backend.repositories.PermissionsRepo;
import org.springframework.stereotype.Service;

@Service
public class IPermissionsService implements IPermissions {
    private final PermissionsRepo permissionsRepo;

    public IPermissionsService(PermissionsRepo permissionsRepo) {
        this.permissionsRepo = permissionsRepo;
    }
}
