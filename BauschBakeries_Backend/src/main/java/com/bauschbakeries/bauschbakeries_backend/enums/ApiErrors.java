package com.bauschbakeries.bauschbakeries_backend.enums;

import lombok.Getter;

@Getter
public enum ApiErrors {
    API_ERROR("Some API error occured"),
    CARD_ERROR("A card error happened"),
    idempotency_error("dunno what this means"),
    invalid_request_error("Invalid request");

    private final String errors;

    ApiErrors(String errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", errors, super.toString());
    }

}
