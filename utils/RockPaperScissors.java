package utils;

import java.io.Console;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
    public void playRockPaperScissors() {
        int rockIndex = 0;
        int paperIndex = 1;
        int scissorIndex = 2;

        int pcIndex = getRandomIndex(0, 2);

    }

    public int getRandomIndex(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public void startGame() {
        System.out.println("Welcome to the game of rock paper sciccors!");
    }
}
