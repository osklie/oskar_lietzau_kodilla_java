import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w grze, podaj rozmiar planszy");
        int dim = new Scanner(System.in).nextInt();
        char[][] board = new char[dim][dim];
            System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
            System.out.println("_____");
            System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
            System.out.println("_____");
            System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

        int movesCounter = 0;
        char activePlayer = 'X';
        // jeżeli kod w pętli zmieni wartość w tej zmiennej na true, nie wykona się kolejna iteracja
        boolean won = false;
        while (movesCounter < dim * dim && !won) {
            printBoard(board); // drukuje plansze zeby był widoczny rezultat
            boolean moveWasCorrect = performMove(board, activePlayer);
            if (moveWasCorrect) {
                // zwiększam licznik ruchów o 1
                movesCounter++;
                // sprawdzam czy po tym ruchu ktoś nie wygrał
                won = checkWinner(board, activePlayer);
                // zmieniam aktywnego gracza na przeciwnego
                activePlayer = activePlayer == 'X' ? 'O' : 'X';
            } else {
                System.out.println("Ruch niepoprawny, spróbuj ponownie");
            }
        }
        printBoard(board);
        System.out.println("Koniec gry :)");
    }

    private static boolean checkWinner(char[][] board, char activePlayer) {
        return checkFirstDiagonal(board, activePlayer) ||
                checkSecondDiagonal(board, activePlayer) ||
                checkWinInColumns(board, activePlayer) ||
                checkWinInRows(board, activePlayer);
    }

    private static boolean checkFirstDiagonal(char[][] board, char activePlayer) {
        int dim = board.length;
        for (int i = 0; i < dim; i++) {
            if (board[i][i] != activePlayer) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkSecondDiagonal(char[][] board, char activePlayer) {
        int dim = board.length;
        for (int i = 0; i < dim; i++) {
            if (board[i][dim - i - 1] != activePlayer) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkWinInRows(char[][] board, char activePlayer) {
        int dim = board.length;
        // licznik col będzie sprawdzał w kolejnych iteracjach
        // kolejne kolumny od 0 aż do dim
        for (int row = 0; row < dim; row++) {
            // zakładam optymistycznie, że activePlayer wygrał
            boolean win = true;
            // licznik col będzie przesuwał się po kolejnych
            // wierszach dla danej kolumny col
            for (int col = 0; col < dim; col++) {
                // jeżeli trafię na pierwszą komórkę w której
                // nie ma symbolu activePlayer, to wiem, że
                // w tej kolumnie nie wygrał, więc ustawiam
                // flagę win na false i przerywam sprawdzanie
                // kolejnych komórek
                if (board[row][col] != activePlayer) {
                    win = false;
                    break;
                }
            }
            // jeżeli po sprawdzeniu danej kolumny
            // flaga win dalej ma wartość true, to znaczy
            // że gracz wygrał w tej kolumnie
            // przerywam więc całą metodę zwracając true
            if (win) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkWinInColumns(char[][] board, char activePlayer) {
        int dim = board.length;
        // licznik col będzie sprawdzał w kolejnych iteracjach
        // kolejne kolumny od 0 aż do dim
        for (int col = 0; col < dim; col++) {
            // zakładam optymistycznie, że activePlayer wygrał
            boolean win = true;
            // licznik col będzie przesuwał się po kolejnych
            // wierszach dla danej kolumny col
            for (int row = 0; row < dim; row++) {
                // jeżeli trafię na pierwszą komórkę w której
                // nie ma symbolu activePlayer, to wiem, że
                // w tej kolumnie nie wygrał, więc ustawiam
                // flagę win na false i przerywam sprawdzanie
                // kolejnych komórek
                if (board[row][col] != activePlayer) {
                    win = false;
                    break;
                }
            }
            // jeżeli po sprawdzeniu danej kolumny
            // flaga win dalej ma wartość true, to znaczy
            // że gracz wygrał w tej kolumnie
            // przerywam więc całą metodę zwracając true
            if (win) {
                return true;
            }
        }
        return false;
    }

    private static boolean performMove(char[][] board, char activePlayer) {
        System.out.println(activePlayer + ", podaj nr wiersza");
        int row = new Scanner(System.in).nextInt();
        System.out.println(activePlayer + ", podaj nr kolumny");
        int col = new Scanner(System.in).nextInt();

        if (board[row][col] == 0) { // jeżeli pole jest wolne
            board[row][col] = activePlayer; // wstaw tam symbol obecnego gracza

            // jako że przeniosłem tę metodę to nie będę już tutaj
            // modyfikował licznika ruchów ani zmieniał gracza
            // zrobię to metodzie main

            return true; // zwracam true jezeli ruch sie udał
            // jeżeli kod dojdzie do tej linii to znaczy ze się udał
        } else { // ten else jest opcjonalny, wystarczyloby return false (dlaczego?)
            return false; // zwroce false, jeżeli miejsce było zajęte
        }

    }

    public static void printBoard(char[][] board) {
        int dim = board.length;
        // nagłówki kolumn
        System.out.print("\t");
        for (int i = 0; i < dim; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int row = 0; row < dim; row++) {
            System.out.print(row + ":\t");
            for (int column = 0; column < dim; column++) {
                System.out.print(board[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
////
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println("Witaj w grze, podaj rozmiar planszy");
//        int dim = new Scanner(System.in).nextInt();
//
//        char[][] game = new char[3][3];
//        int horizontal;
//        int vertical;
//
//        for (int i = 0; i <= 9; i++) {
//            System.out.println("Gracz numer: " + ticTacToe.getPlayer() + " -krzyżyk. Podaj lokalizację");
//            horizontal = scan.nextInt();
//            vertical = scan.nextInt();
//            game[horizontal][vertical] = 'X';

//            System.out.println(game[0][0] + "|" + game[0][1] + "|" + game[0][2]);
//            System.out.println("-+-+-");
//            System.out.println(game[1][0] + "|" + game[1][1] + "|" + game[1][2]);
//            System.out.println("-+-+-");
//            System.out.println(game[2][0] + "|" + game[2][1] + "|" + game[2][2]);
//            boolean b = game[0][0] == 'X' && game[0][1] == 'X' && game[0][2] == 'X';
//            boolean c = game[1][0] == 'X' && game[1][1] == 'X' && game[1][2] == 'X';
//            boolean d = game[2][0] == 'X' && game[2][1] == 'X' && game[2][2] == 'X';
//            boolean e = game[0][0] == 'X' && game[1][0] == 'X' && game[2][0] == 'X';
//            boolean f = game[0][1] == 'X' && game[1][1] == 'X' && game[2][1] == 'X';
//            boolean g = game[0][2] == 'X' && game[1][2] == 'X' && game[2][2] == 'X';
//            boolean h = game[0][0] == 'X' && game[1][1] == 'X' && game[2][2] == 'X';
//            boolean j = game[0][2] == 'X' && game[1][1] == 'X' && game[2][0] == 'X';
//            if (winner(b, c, d, e, f, g, h, j)) {
//                System.out.println("Wygrał gracz"+ ticTacToe.getPlayer());
//                System.exit(0);
//            }
//            int secondPlayer;
//            if(ticTacToe.getPlayer()==1){
//                secondPlayer=2;
//            }else{
//                secondPlayer=1;
//            }
//            System.out.println("Gracz numer: "+secondPlayer+" -kółko. Podaj lokalizację");
//            horizontal = scan.nextInt();
//            vertical = scan.nextInt();
//            game[horizontal][vertical] = 'O';
//            System.out.println(game[0][0] + "|" + game[0][1] + "|" + game[0][2]);
//            System.out.println("-+-+-");
//            System.out.println(game[1][0] + "|" + game[1][1] + "|" + game[1][2]);
//            System.out.println("-+-+-");
//            System.out.println(game[2][0] + "|" + game[2][1] + "|" + game[2][2]);
//            boolean bo = game[0][0] == 'O' && game[0][1] == 'O' && game[0][2] == 'O';
//            boolean co = game[1][0] == 'O' && game[1][1] == 'O' && game[1][2] == 'O';
//            boolean od = game[2][0] == 'O' && game[2][1] == 'O' && game[2][2] == 'O';
//            boolean eo = game[0][0] == 'O' && game[1][0] == 'O' && game[2][0] == 'O';
//            boolean fo = game[0][1] == 'O' && game[1][1] == 'O' && game[2][1] == 'O';
//            boolean go = game[0][2] == 'O' && game[1][2] == 'O' && game[2][2] == 'O';
//            boolean ho = game[0][0] == 'O' && game[1][1] == 'O' && game[2][2] == 'O';
//            boolean jo = game[0][2] == 'O' && game[1][1] == 'O' && game[2][0] == 'O';
//            if (winner(bo, co, od, eo, fo, go, ho, jo)) {
//                System.out.println("Wygrał gracz:"+secondPlayer);
//                System.exit(0);
//            }
//        }
//
//    }
//
//    private static boolean winner(boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h, boolean j) {
//        return b == true || c == true || d == true || e == true || f == true || g == true || h == true || j == true;
//    }
//}