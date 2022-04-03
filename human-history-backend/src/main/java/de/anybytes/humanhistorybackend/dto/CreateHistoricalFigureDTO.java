package de.anybytes.humanhistorybackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateHistoricalFigureDTO {

    private String firstName;
    private String surName;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
}
