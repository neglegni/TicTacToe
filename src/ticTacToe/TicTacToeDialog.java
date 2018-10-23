package ticTacToe;

import java.util.Scanner;

public class TicTacToeDialog {
//Fehler abfangen und Computer gegen Computer spielen lassen.
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
            // bestimmt den aktuellen Spieler.
            System.out.println("In welche Zeile soll das Zeichen gesetzt werden?");
            while(!sc.hasNextInt()){
                System.out.println("Nur Ganze Zahlen");
                sc.next();
            }
            int zeile = sc.nextInt();

            System.out.println("In welche Spalte soll das Zeichen gesetzt werden?");
            while(!sc.hasNextInt()){
                System.out.println("Nur Ganze Zahlen");
                sc.next();
            }
            int spalte = sc.nextInt();

            if (rundeCounter % 2 == 0) {
                korrekterZug = (t.place(zeichen1, zeile, spalte));
            } else {
                korrekterZug = (t.place(zeichen2, zeile, spalte));
            }

            System.out.println("du hast zeile " + zeile + " und spalte " + spalte + " gewählt");

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
