package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;


import java.util.Scanner;

import static hexlet.code.Engine.gameEngine;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nPlease enter the game number and press Enter.");
        System.out.println("\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");

        String gameMode = scanner.next();

        switch (gameMode) {
            case "0":
                scanner.close();
            case "1":
                Cli.greetings();
                break;
            case "2":
                gameEngine(new Even());
                break;
            case "3":
                gameEngine(new Calc());
                break;
            case "4":
                gameEngine(new GCD());
                break;
            case "5":
                gameEngine(new Progression());
                break;
            case "6":
                gameEngine(new Prime());
                break;
            default:
                System.out.println("Sorry, wrong number of game.");
        }

    }
}
