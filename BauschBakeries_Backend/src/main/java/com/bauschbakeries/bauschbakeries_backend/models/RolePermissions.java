package com.bauschbakeries.bauschbakeries_backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "role_permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RolePermissions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Roles roleId;

    @OneToOne
    @JoinColumn(name = "permission_id", nullable = false)
    private Permissions permissionId;
}
