package StarWars;

import StarWars.CLI.MainCommand;
import picocli.CommandLine;


public class Main
{
        public static void main( String[] args )
        {

            CommandLine cmd = new CommandLine(new MainCommand());
            cmd.setExecutionStrategy(new CommandLine.RunAll()); // default is RunLast
            cmd.execute(args);

            if (args.length < 0) { cmd.usage(System.out); }
        }

}

