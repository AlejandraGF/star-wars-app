package StarWars.CLI;

import StarWars.People;
import StarWars.Planet;
import StarWars.StarWarsService;
import picocli.CommandLine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@CommandLine.Command(name = "planet", description = "Gets information for certain planet")
public class PlanetCommand implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlanetCommand.class);

    private static StarWarsService starWarsService = new StarWarsService();

    @CommandLine.Parameters(paramLabel = "<planet code>", description = "code to be resolved")
    private String planetCode;

    @Override
    public void run() {
        Planet report = starWarsService.getPlanet(planetCode);
        System.out.println(report);
        System.out.println("llega");

    }
}
