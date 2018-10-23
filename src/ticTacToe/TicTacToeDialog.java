package ticTacToe;

import java.util.Scanner;

public class TicTacToeDialog {



    public static void main(String[] args) {
        Mark zeichen1 = new Mark('x');
        Mark zeichen2 = new Mark('o');
        int rundeCounter = 0;
        TicTacToe t = new TicTacToe();
        t.printBoard();
        Scanner sc = new Scanner(System.in);

        /** Spiel läuft bis jemand gewonnnen hat oder Alle Felder belegt sind. */
        while (!t.hasWon(zeichen1) && !t.hasWon(zeichen2) && rundeCounter < 9) {
            boolean korrekterZug;
            System.out.println("In welche Zeile soll das Zeichen gesetzt werden?");
            int zeile = sc.nextInt();
            System.out.println("In welche Spalte soll das Zeichen gesetzt werden?");
            int spalte = sc.nextInt();
            System.out.println("du hast zeile " + zeile + " und spalte " + spalte + " gewählt");

            // bestimmt den aktuellen Spieler.
            if (rundeCounter % 2 == 0) {
                korrekterZug = (t.place(zeichen1, zeile, spalte));
            } else {
                korrekterZug = (t.place(zeichen2, zeile, spalte));
            }

            t.printBoard();

            // prüft ob der Zug wiederholt werden muss
            if (korrekterZug) {
                rundeCounter++;
            } else {
                System.out.println("Schummeln ist nicht erlaubt!");
            }
        }

        // Ausgabe für Sieg oder Unentschieden.
        if(t.hasWon(zeichen1)){
             System.out.println("Spieler " + zeichen1 + " hat gewonnn!");
        } else if (t.hasWon(zeichen2)) {
            System.out.println("Spieler " + zeichen2 + " hat gewonnn!");
        } else {
            System.out.println("Unentschieden, Spiel vorbei!");
        }
        System.out.println();
        sc.close();
    }

}
