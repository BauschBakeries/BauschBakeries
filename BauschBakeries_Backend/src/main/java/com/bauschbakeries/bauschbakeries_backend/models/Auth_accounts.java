package com.bauschbakeries.bauschbakeries_backend.models;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "Authenticated_accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Auth_accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Nonnull
    private String provider;

    @Nonnull
    private String providerId;

    private String avatarUrl;

    private String accessToken;

    private String refreshToken;

    private LocalDateTime expiresAt;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
