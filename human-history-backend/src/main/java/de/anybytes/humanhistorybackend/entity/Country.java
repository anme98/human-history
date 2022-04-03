package de.anybytes.humanhistorybackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String headOfState;
    @ManyToOne
    @JoinColumn(name = "flag_id")
    private Image flag;

    public Country(String name) {
        this.name = name;
    }
}
