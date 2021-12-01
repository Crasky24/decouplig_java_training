package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;


public class ComputerPlayer implements Player{
    private final Logger logger = LoggerFactory.getLogger("player");

    public long askNextGuess() {
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(100);
        return randomNumber;
    }

    public void respond(boolean lowerOrGreater){

    }
}
