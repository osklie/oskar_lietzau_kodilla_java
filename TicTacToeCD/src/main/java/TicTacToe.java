import com.example.game.gameCommand;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        System.out.println("Witaj w grze Tic Tac Toe :D, podaj wymiar planszy ktorą wybierasz : ");
       // Scanner scanner = new Scanner(System.in);
       // String line = scanner.nextLine();
        //gameCommand command = gameCommand.of(line);
        //gameCommand pcCommand = pcCommand();
        char obecnySymbol = 'x';
        int wymiar = Integer.parseInt(new Scanner(System.in).nextLine());
        char[][] plansza = new char[wymiar][wymiar];



            TicTacToe.drukujPlansze(plansza);
            while (true) {
//        System.out.println("zadecyduj czy chcesz byc 'X' czy moze 'O'");
//
//            if (command == gameCommand.x) {
//                System.out.println("wybrales krzyzyk");
//            }
//            if (command == gameCommand.o) {
//                System.out.println("Wybrales kolko");
//            }
//
            System.out.println(obecnySymbol + " twoj ruch");
            System.out.println("podaj indeks wiersza");
            int wiersz = new Scanner(System.in).nextInt();
            System.out.println("podaj indeks kolumny");
            int kolumna = new Scanner(System.in).nextInt();
            boolean ruchPrawidlowy = plansza[wiersz][kolumna] == 0;
            if (!ruchPrawidlowy) {
                System.out.println("Ruch nipoprawny!");
                continue;
            }
            plansza[wiersz][kolumna] = obecnySymbol;
            TicTacToe.drukujPlansze(plansza);

            if (obecnySymbol == 'x') {
                obecnySymbol = 'o';
            } else {
                obecnySymbol = 'x';
            }
        }



    }


    public static void drukujPlansze(char[][] plansza) {

        int wymiar = plansza.length;

        System.out.print("\t");
        for (int i = 0; i < wymiar; i++) {
            System.out.print(i + "\t\t");
        }
        System.out.println();

        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            System.out.print(wiersz + ":\t");
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                System.out.print(plansza[wiersz][kolumna] + "\t|\t");

            }
            System.out.println();
        }

    }

    private static gameCommand pcCommand() {
    return null;
    }


}