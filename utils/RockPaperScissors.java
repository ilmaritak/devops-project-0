package utils;

import java.io.Console;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
    private final int rockIndex = 0;
    private final int paperIndex = 1;
    private final int scissorIndex = 2;
    private final Console c = System.console();

    public void playRockPaperScissors() {
        startGame();

        String input = c.readLine();
        int yourIndex;

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

        int pcIndex = getRandomIndex(0, 2);

        calculateWinner(yourIndex, pcIndex);
    }

    public int getRandomIndex(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public void startGame() {
        System.out.println("Welcome to the game of rock paper sciccors!");
        System.out.println("Type eiher <rock>, <paper> or <scissors>");
    }

    public void calculateWinner(int palyerIndex, int pcIndex) {
        switch (palyerIndex) {
            case rockIndex:
                if (pcIndex == rockIndex) {
                    System.out.println("PC picked rock. Game is tie!");
                } else if (pcIndex == paperIndex) {
                    System.out.println("PC picked paper. You lost!");
                } else {
                    System.out.println("PC picked scissors. You won!");
                }
                break;
            case paperIndex:
                if (pcIndex == rockIndex) {
                    System.out.println("PC picked rock. You won!");
                } else if (pcIndex == paperIndex) {
                    System.out.println("PC picked paper. Game is tie!");
                } else {
                    System.out.println("PC picked scissors. You lost!");
                }
                break;
            default:
                if (pcIndex == rockIndex) {
                    System.out.println("PC picked rock. You Lost!");
                } else if (pcIndex == paperIndex) {
                    System.out.println("PC picked paper. You won!");
                } else {
                    System.out.println("PC picked scissors. Game is tie!");
                }
                break;
        }
    }
}
