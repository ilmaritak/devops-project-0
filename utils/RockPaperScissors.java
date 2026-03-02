package utils;

import java.io.Console;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
    final int rockIndex = 0;
    final int paperIndex = 1;
    final int scissorIndex = 2;
    final Console c = System.console();

    public void playRockPaperScissors() {

    }

    public int getRandomIndex(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public void startGame() {
        System.out.println("Welcome to the game of rock paper sciccors!");
        System.out.println("Type eiher <rock>, <paper> or <scissors>");

        String input = c.readLine();
        int yourIndex = 0;

        switch (input) {
            case "rock":
                yourIndex = rockIndex;
                break;
            case "paper":
                yourIndex = paperIndex;
            default:
                yourIndex = scissorIndex;
                break;
        }
    }
}
