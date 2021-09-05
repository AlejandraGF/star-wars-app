package StarWars.CLI;

import StarWars.People;
import StarWars.StarWarsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

import java.sql.SQLOutput;

@CommandLine.Command(name = "people", description = "Gets information for a certain id")
public class PeopleCommand implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(PeopleCommand.class);

    private static StarWarsService starWarsService = new StarWarsService();

    @CommandLine.Parameters(paramLabel = "<people code>", description = "id to be resolved")
    private String peopleCode;

    @Override
    public void run() {
        People report = starWarsService.getPeople(peopleCode);
        System.out.println(report);
        System.out.println("llega");
    }
}
