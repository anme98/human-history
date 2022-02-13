package de.anybytes.humanhistorybackend;

import de.anybytes.humanhistorybackend.entity.Country;
import de.anybytes.humanhistorybackend.entity.HistoricalFigure;
import de.anybytes.humanhistorybackend.entity.HistoryCategory;
import de.anybytes.humanhistorybackend.entity.HistoryEvent;
import de.anybytes.humanhistorybackend.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DatabaseInitilizer implements CommandLineRunner {


    private final CountryRepository countryRepository;

    @Autowired
    public DatabaseInitilizer(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        LocalDate dateOfBirthMerkel= LocalDate.of(1954, 7, 17);
        LocalDate dateOfBirthObama = LocalDate.of(1961, 8, 4);
        LocalDate dateOfWeimar = LocalDate.of(1919,0,0);
        LocalDate dateOfTheFall = LocalDate.of(1989,11,11);
        Country germany = new Country("Germany");
        Country italy = new Country("Italy");
        HistoricalFigure angelaMerkel = new HistoricalFigure("Angela", "Merkel", dateOfBirthMerkel, "Hamburg");
        HistoricalFigure barackObama = new HistoricalFigure("Barack", "Obama", dateOfBirthObama, "Honolulu");
        HistoryCategory categoryPhilosophy = new HistoryCategory("Philosophy");
        HistoryCategory categoryScience = new HistoryCategory("Science");
        HistoryEvent fallOfTheBerlinWall = new HistoryEvent("Fall of the Berlin Wall", dateOfTheFall, germany, "Der Mauerfall der Berliner Mauer");
        HistoryEvent weimarerRepublik = new HistoryEvent("Weimarer Republik", dateOfWeimar, germany, "Die erste Demokratie in Deutschland");
        try {
            countryRepository.saveAll(Arrays.asList(germany, italy));
        } catch (Exception e) {
            throw new Exception("Daten konnten nicht gespeichert werden");
        }

    }
}
