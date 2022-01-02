package com.amigoscode.customer;

public record CustomRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
