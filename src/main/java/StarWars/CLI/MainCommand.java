package StarWars.CLI;

import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;

@Command(
        name = "StarWars",
        subcommands = {
                PeopleCommand.class,
                PlanetCommand.class,
                HelpCommand.class },
        description = "StarWars API")
public class MainCommand implements Runnable {

    @Override
    public void run() {

    }
}
