package com.workintech.movieapp.dto;

import java.time.LocalDate;

public record ActorResponse(int id, String firstName, String lastName,
                            String gender, LocalDate birthDate) {
}
