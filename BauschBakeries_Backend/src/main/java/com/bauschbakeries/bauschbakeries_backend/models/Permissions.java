package com.bauschbakeries.bauschbakeries_backend.models;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="permissions")
public class Permissions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Nonnull
    private String Name;

    private LocalDateTime CreatedAt;

    private LocalDateTime UpdatedAt;

    @PrePersist
    protected void onCreate() {
        this.CreatedAt = LocalDateTime.now();
        this.UpdatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.UpdatedAt = LocalDateTime.now();
    }
}
