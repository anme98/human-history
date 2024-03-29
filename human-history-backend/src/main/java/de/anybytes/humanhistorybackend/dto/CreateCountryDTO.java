package de.anybytes.humanhistorybackend.dto;

import de.anybytes.humanhistorybackend.entity.Image;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCountryDTO {

    private String name;
    private String headOfState;
    private MultipartFile flag;
}
