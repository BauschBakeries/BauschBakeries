package com.bauschbakeries.bauschbakeries_backend.models;


import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Permissions {

    @Id
    @OneToOne
    @JoinColumn(name = "role_id", nullable = false)
    private role_permissions rolePermissions;

    @Nonnull
    private String name;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
