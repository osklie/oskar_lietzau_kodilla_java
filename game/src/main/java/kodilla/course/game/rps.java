package kodilla.course.game;

import com.example.game.gameCommand;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class rps {

    public static void main(String[] args) {

        System.out.println("Hello! Whats your name? :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String answer = "";



        System.out.println("OK! " + name + " remember :");
        System.out.println("key 1 is rock");
        System.out.println("key 2 is paper");
        System.out.println("key 3 is scissors");
        System.out.println("key 4 is lizard");
        System.out.println("key 5 is spock");
        System.out.println("key 6 is quit the current game");
        System.out.println("key 7 is start the games all over again");

        System.out.println("enter the number you choose");

        while (true) {
            try {

                String line = scanner.nextLine();

                gameCommand command = gameCommand.of(line);
                gameCommand pcCommand = pcCommand();
                gameCommand outCommand = gameCommand.of(line);

                if (command == gameCommand.quitTheGame) {
                    System.out.println("do you want to quit the game? YES / NO");
                    answer= scanner.nextLine();
                }

                while (answer.equalsIgnoreCase("YES"));
                if (answer.equalsIgnoreCase("NO")){
                    System.out.println("Goodbye!");
                    break;

                }

                if (command == gameCommand.NEWGAME) {
                    System.out.println("we are starting over");
                    System.out.println(name + " enter the number of your choice ");
                    continue;


                }

                if (isDraw(command, pcCommand)) {
                    System.out.println("Draw !");
                } else if (isFirstWin(command, pcCommand)) {
                    System.out.println("User win");
                } else if (isTwoWin(command, pcCommand)) {
                    System.out.println("pc win");
                }


                System.out.println("you chose " + command);
                System.out.println("pc chose " + pcCommand);


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

}

    private static boolean isFirstWin(gameCommand a, gameCommand b) {
        return a == gameCommand.ROCK && b == gameCommand.SCISSORS
                || a == gameCommand.PAPER && b == gameCommand.ROCK
                || a == gameCommand.SCISSORS && b == gameCommand.PAPER
                || a == gameCommand.ROCK && b == gameCommand.LIZARD
                || a == gameCommand.PAPER && b == gameCommand.SPOCK
                || a == gameCommand.LIZARD && b == gameCommand.SPOCK
                || a == gameCommand.SPOCK && b == gameCommand.SCISSORS
                || a == gameCommand.SCISSORS && b == gameCommand.LIZARD
                || a == gameCommand.LIZARD && b == gameCommand.PAPER
                || a == gameCommand.SPOCK && b == gameCommand.ROCK;
    }
    private static boolean isTwoWin(gameCommand b, gameCommand a) {
        return a == gameCommand.ROCK && b == gameCommand.SCISSORS
                || a == gameCommand.PAPER && b == gameCommand.ROCK
                || a == gameCommand.SCISSORS && b == gameCommand.PAPER
                || a == gameCommand.ROCK && b == gameCommand.LIZARD
                || a == gameCommand.PAPER && b == gameCommand.SPOCK
                || a == gameCommand.LIZARD && b == gameCommand.SPOCK
                || a == gameCommand.SPOCK && b == gameCommand.SCISSORS
                || a == gameCommand.SCISSORS && b == gameCommand.LIZARD
                || a == gameCommand.LIZARD && b == gameCommand.PAPER
                || a == gameCommand.SPOCK && b == gameCommand.ROCK;
    }
    private static boolean isDraw(gameCommand a, gameCommand b) {
        return a == b;
    }

    private static gameCommand pcCommand() {
        List<gameCommand> allowedCommands = Arrays.asList(gameCommand.ROCK, gameCommand.PAPER, gameCommand.SCISSORS,
        gameCommand.LIZARD, gameCommand.SPOCK);


        return allowedCommands.get(getRandomNumber(0, 5));
    }
    static int getRandomNumber( int min, int max) {
        return (int) ((Math.random() * (max - min) + min));
    }
}