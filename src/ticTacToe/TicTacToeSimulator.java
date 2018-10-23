package ticTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeSimulator {


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
            if (rundeCounter % 2 == 0) {
                simuliereZug(t,zeichen1);
            } else {
                simuliereZug(t, zeichen2);
            }
            rundeCounter++;
            t.printBoard();
        }

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

    public static void simuliereZug(TicTacToe t, Mark zeichen){
        int zeile = 0;
        int spalte = 0;
        Random zufall = new Random();
        boolean korrekterZug = false;
        while (!korrekterZug){
            zeile = zufall.nextInt(3);
            spalte = zufall.nextInt(3);
            korrekterZug = t.place(zeichen,zeile,spalte);
        }
        System.out.println("Der Computer "+zeichen+" hat die Zeile "+zeile+" und die Spalte "+spalte+" gewählt.");
    }
}
