package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{
    private final Logger logger = LoggerFactory.getLogger("player");

    public long askNextGuess(){
        logger.log("Choisir un nombre : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void respond(boolean lowerOrGreater){
        if(lowerOrGreater){
            logger.log("Nombre trop petit !\n");
        }
        else
        {
            logger.log("Nombre trop grand !\n");
        }
    }
}
