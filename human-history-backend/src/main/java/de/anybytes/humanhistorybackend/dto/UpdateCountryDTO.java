package de.anybytes.humanhistorybackend.dto;


import de.anybytes.humanhistorybackend.entity.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCountryDTO {
    private Long id;
    private String name;
    private String headOfState;
    private Image flag;
}
