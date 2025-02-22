package com.bauschbakeries.bauschbakeries_backend.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Nonnull
    private String Username;

    @Nonnull
    private String Email;

    private LocalDateTime CreatedAt;

    private LocalDateTime UpdatedAt;

    @OneToMany(mappedBy = "UserId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OAuthAccounts> oauthAccounts;

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
