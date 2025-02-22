package com.bauschbakeries.bauschbakeries_backend.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "oauth_accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OAuthAccounts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @ManyToOne
    @JoinColumn(name = "UserId", nullable = false)
    private Users UserId;

    @Notnull
    private String Provider;

    @Nonnull
    private String ProviderId;

    private String AvatarUrl;

    private String AccessToken;

    private String RefreshToken;

    private LocalDateTime ExpiresAt;

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
