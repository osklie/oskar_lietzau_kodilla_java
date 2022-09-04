import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        //gameCommand pcCommand = pcCommand();


        System.out.println("Witaj w grze Tic Tac Toe :D, podaj wymiar planszy ktorą wybierasz : ");

        int wymiar = Integer.parseInt(new Scanner(System.in).nextLine());
        char[][] plansza = new char[wymiar][wymiar];

        System.out.println("wybierz znak gracza");
        Scanner scanner = new Scanner(System.in);
        char symbolGracza = scanner.next().charAt(0);
        System.out.println("ok wybrales : " + symbolGracza);

        System.out.println("wybierz znak komputera");
        char pcSymbol = scanner.next().charAt(0);
        System.out.println("ok wybrales : " + pcSymbol);



        boolean czyKontynuowac = true;
        int licznikRuchow = 0;
        char obecnySymbol ;
        while (czyKontynuowac && licznikRuchow <= wymiar * wymiar) {
            TicTacToe.drukujPlansze(plansza);
            if (licznikRuchow % 2 == 0) {
                obecnySymbol = symbolGracza;
                wykonajRuch(plansza, obecnySymbol);
            }else{
                obecnySymbol = pcSymbol;
                pcCommand(plansza, obecnySymbol);
            }
            czyKontynuowac = !wygrana(plansza, obecnySymbol);
            licznikRuchow++;
        }

    }

    public static boolean sprawdzSkos1(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        int licznik = 0;
        for (int i = 0; i < wymiar; i++) {
            if (plansza[i][i] == symbol) {
                licznik++;
            }
        }
        return licznik == wymiar;
    }

    private static boolean sprawdzSkos2(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        int licznik = 0;
        for (int i = 0; i < wymiar; i++) {
            if (plansza[i][wymiar - i - 1] == symbol) {
                licznik++;
            }
        }
        return licznik == wymiar;
    }


    private static boolean sprawdzWiersze(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        int licznik = 0;
        boolean wygrana = false;
        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                if (plansza[wiersz][kolumna] == symbol) {
                    licznik++;
                }
            }
            if (licznik == wymiar) {
                wygrana = true;
                break;
            }else{
                licznik = 0;
            }
        }

        return wygrana;
    }

    private static boolean sprawdzKolumny(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        int licznik = 0;
        boolean wygrana = false;
        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
            for (int wiersz = 0; wiersz < wymiar; wiersz++) {
                if (plansza[wiersz][kolumna] == symbol) {
                    licznik++;
                }
            }
            if (licznik == wymiar) {
                wygrana = true;
                break;
            }else{
                licznik = 0;
            }
        }

        return wygrana;
    }

    public static void wykonajRuch(char[][] plansza, char symbol) {

        int wiersz = 0;
        int kolumna = 0;
        boolean ruchPrawidlowy = false;
        while (!ruchPrawidlowy) {
            System.out.println("Twoj ruch");
            System.out.println("podaj indeks wiersza");
            wiersz = new Scanner(System.in).nextInt();
            System.out.println("podaj indeks kolumny");
            kolumna = new Scanner(System.in).nextInt();
            ruchPrawidlowy = plansza[wiersz][kolumna] == 0;
            if (!ruchPrawidlowy) {
                System.out.println("Ruch nipoprawny!");
            }
        }
        plansza[wiersz][kolumna] = symbol;
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

    private static void pcCommand(char[][] plansza,char symbol) {
        //List<gameCommand> allowedCommands = Arrays.asList(gameCommand.one, gameCommand.two, gameCommand.three);

        int kolumna = 0;
        int wiersz = 0;

        boolean ruchPrawidlowy = false;
        while (!ruchPrawidlowy) {
            kolumna = getRandomNumber(0, 2);
            wiersz = getRandomNumber(0, 2);
            ruchPrawidlowy = plansza[wiersz][kolumna] == 0;

        }
        plansza[wiersz][kolumna] = symbol;
    }



    static int getRandomNumber( int min, int max) {
        return (int) ((Math.random() * (max - min) + min));
    }

    public static boolean wygrana(char[][] plansza, char obecnySymbol) {
        boolean wygranaWiersza = sprawdzWiersze(plansza, obecnySymbol);
        boolean wygranaKolumny = sprawdzKolumny(plansza, obecnySymbol);
        boolean wygranaSkos1 = sprawdzSkos1(plansza, obecnySymbol);
        boolean wygranaSkos2 = sprawdzSkos2(plansza, obecnySymbol);



        if (wygranaWiersza || wygranaKolumny || wygranaSkos1 || wygranaSkos2) {
            System.out.println("gratulacje " + obecnySymbol);
            return true;
        }
        return false;
    }
}


