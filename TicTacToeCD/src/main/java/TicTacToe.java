import com.example.game.gameCommand;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        gameCommand pcCommand = pcCommand();
        String answer = "";

        System.out.println("Witaj w grze Tic Tac Toe :D, podaj wymiar planszy ktorą wybierasz : ");

        int wymiar = Integer.parseInt(new Scanner(System.in).nextLine());
        char[][] plansza = new char[wymiar][wymiar];

        System.out.println("wybierz znak");
        Scanner scanner = new Scanner(System.in);
        char obecnySymbol = scanner.next().charAt(0);
        System.out.println("ok wybrales : " + obecnySymbol);

//        while (answer.equalsIgnoreCase("o"));
//        if (answer.equalsIgnoreCase("x")) {
//            System.out.println(obecnySymbol);
//        }

        boolean czyKontynuowac = true;
        int licznikRuchow = 0 ;
        while (czyKontynuowac && licznikRuchow<= wymiar*wymiar) {
            TicTacToe.drukujPlansze(plansza);
            boolean ruchPoprawny = wykonajRuch(plansza, obecnySymbol);
            if(ruchPoprawny) {
                licznikRuchow++;
                boolean wygranaWiersza = sprawdzWiersze(plansza, obecnySymbol);
                boolean wygranaKolumny = sprawdzKolumny(plansza, obecnySymbol);
                boolean wygranaSkos1 = sprawdzSkos1(plansza, obecnySymbol);
                boolean wygranaSkos2 = sprawdzSkos2(plansza, obecnySymbol);


                if (wygranaWiersza || wygranaKolumny || wygranaSkos1 || wygranaSkos2) {
                    System.out.println("gratulacje " + obecnySymbol);
                    czyKontynuowac = false;
                }


                System.out.println("you chose " + obecnySymbol);
                System.out.println("pc chose " + pcCommand);
//                    if (obecnySymbol == 'x') {
//                        obecnySymbol = 'o';
//                    } else {
//                        obecnySymbol = 'x';
//                    }
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
            }
        }

    }

    public static boolean sprawdzSkos1(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int i = 0; i<wymiar; i++){
            if (plansza[i][i] != symbol) {
                return false;
            }
        }
        return true;
    }

    private static boolean sprawdzSkos2(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int i = 0; i < wymiar; i++) {
            if (plansza[i][wymiar - i - 1] != symbol) {
                return false;
            }
        }
        return true;
    }


    private static boolean sprawdzWiersze(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            boolean wygrana = true;
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana) {
                return true;
            }
        }
        return false;
    }

    private static boolean sprawdzKolumny(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
            boolean wygrana = true;
            for (int wiersz = 0; wiersz < wymiar; wiersz++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana) {
                return true;
            }
        }
        return false;
    }




    public static boolean wykonajRuch(char[][] plansza, char symbol) {
        System.out.println(symbol + " twoj ruch");
        System.out.println("podaj indeks wiersza");
        int wiersz = new Scanner(System.in).nextInt();
        System.out.println("podaj indeks kolumny");
        int kolumna = new Scanner(System.in).nextInt();
        boolean ruchPrawidlowy = plansza[wiersz][kolumna] == 0;
        if (!ruchPrawidlowy) {
            System.out.println("Ruch nipoprawny!");
            return false;
        }
        plansza[wiersz][kolumna] = symbol;
        return true;
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
        List<gameCommand> allowedCommands = Arrays.asList(gameCommand.one, gameCommand.two, gameCommand.three);


        return allowedCommands.get(getRandomNumber(0, 3));
    }


    static int getRandomNumber( int min, int max) {
        return (int) ((Math.random() * (max - min) + min));
    }
}


