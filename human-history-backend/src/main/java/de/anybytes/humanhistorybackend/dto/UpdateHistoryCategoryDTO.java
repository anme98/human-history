package de.anybytes.humanhistorybackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateHistoryCategoryDTO {

    private Long id;
    private String name;
}
