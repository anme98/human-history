package de.anybytes.humanhistorybackend;

import de.anybytes.humanhistorybackend.entity.Country;
import de.anybytes.humanhistorybackend.entity.HistoricalFigure;
import de.anybytes.humanhistorybackend.entity.HistoryCategory;
import de.anybytes.humanhistorybackend.entity.HistoryEvent;
import de.anybytes.humanhistorybackend.repository.CountryRepository;
import de.anybytes.humanhistorybackend.repository.HistoricalFigureRepository;
import de.anybytes.humanhistorybackend.repository.HistoryCategoryRepository;
import de.anybytes.humanhistorybackend.repository.HistoryEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DatabaseInitilizer implements CommandLineRunner {


    private final CountryRepository countryRepository;
    private final HistoryEventRepository historyEventRepository;
    private final HistoricalFigureRepository historicalFigureRepository;
    private final HistoryCategoryRepository historyCategoryRepository;

    @Autowired
    public DatabaseInitilizer(CountryRepository countryRepository, HistoryEventRepository historyEventRepository, HistoricalFigureRepository historicalFigureRepository, HistoryCategoryRepository historyCategoryRepository) {
        this.countryRepository = countryRepository;
        this.historyEventRepository = historyEventRepository;
        this.historicalFigureRepository = historicalFigureRepository;
        this.historyCategoryRepository = historyCategoryRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        LocalDate dateOfBirthMerkel= LocalDate.of(1954, 7, 17);
        LocalDate dateOfBirthObama = LocalDate.of(1961, 8, 4);
        LocalDate dateOfWeimar = LocalDate.of(1919,1,1);
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
            historyEventRepository.saveAll(Arrays.asList(fallOfTheBerlinWall, weimarerRepublik));
            historicalFigureRepository.saveAll(Arrays.asList(angelaMerkel, barackObama));
            historyCategoryRepository.saveAll(Arrays.asList(categoryPhilosophy, categoryScience));
        } catch (Exception e) {
            throw new Exception("Daten konnten nicht gespeichert werden");
        }

    }
}
