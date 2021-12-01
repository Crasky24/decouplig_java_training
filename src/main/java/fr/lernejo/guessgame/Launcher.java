package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        if(args[0].equals("-interactive"))
        {
            HumanPlayer humanPlayer = new HumanPlayer();
            Simulation simulation = new Simulation(humanPlayer);
            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextInt(100);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }

        if(args[0].equals("-auto")){
            ComputerPlayer computerPlayer = new ComputerPlayer();
            Simulation simulation = new Simulation(computerPlayer);
            long nbr = Long.parseLong(args[1]);
            simulation.initialize(nbr);
            simulation.loopUntilPlayerSucceed(1000);

        }
        else{
            System.out.print("Pas conforme");
        }

    }
}
