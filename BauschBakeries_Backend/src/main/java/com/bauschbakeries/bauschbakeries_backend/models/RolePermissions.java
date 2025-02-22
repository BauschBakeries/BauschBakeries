package com.bauschbakeries.bauschbakeries_backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="role_permissions")
public class RolePermissions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @OneToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Roles RoleId;

    @OneToOne
    @JoinColumn(name = "permission_id", nullable = false)
    private Permissions PermissionId;
}
