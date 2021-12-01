package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {

        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {

        long a = player.askNextGuess();
        if(a == numberToGuess) {
            return true;
        }

        if(a < numberToGuess){
            player.respond(true);
        }
        else{
            player.respond(false);
        }

        return false;
    }

    public void loopUntilPlayerSucceed(long iterationMax) {
        boolean vie = false;
        long temps = System.currentTimeMillis();
        int nbIteration = 0;

        while(!vie && nbIteration < iterationMax)
        {
            vie = nextRound();
            nbIteration++;
        }

        if(nbIteration < iterationMax){
            logger.log("Nombre trouve !\n C'etait le "+numberToGuess);
            temps = System.currentTimeMillis() - temps;
            logger.log("\n Temps pour trouver : "+temps);
        }
        else{
            logger.log("Le nombre max d'iteration est atteind. Le nombre etait le : "+numberToGuess);
        }

    }
}
