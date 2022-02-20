package de.anybytes.humanhistorybackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCountryDTO {

    private String name;
    private String headOfState;
    private File flag;
}
