package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.security.SecureRandom;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player = player;
        initialize(numberToGuess);
        loopUntilPlayerSucceed();
    }

    public void initialize(long numberToGuess) {

        SecureRandom random = new SecureRandom();
        this.numberToGuess =  random.nextInt(100);;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {

        logger.log("Choisir un nombre : ");

        long a = player.askNextGuess();
        if(a == numberToGuess) {
            return true;
        }
        if(a > numberToGuess){
            logger.log("Nombre trop grand !\n");
        }
        else{
            logger.log("Nombre trop petit !\n");
        }

        return false;
    }

    public void loopUntilPlayerSucceed() {
        boolean vie = false;

        while(!vie)
        {
            vie = nextRound();
        }
        logger.log("Nombre trouvé !\n C'était le "+numberToGuess);
    }
}
