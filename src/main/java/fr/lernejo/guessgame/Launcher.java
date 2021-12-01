package fr.lernejo.guessgame;

public class Launcher {
    public static void main(String[] args) {
        HumanPlayer humanPlayer = new HumanPlayer();
        new Simulation(humanPlayer);
    }
}
