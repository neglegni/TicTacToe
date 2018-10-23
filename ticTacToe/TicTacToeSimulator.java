package ticTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeSimulator {


    public static void main(String[] args) {
        Mark zeichen1 = new Mark('x');
        Mark zeichen2 = new Mark('o');
        int rundeCounter = 0;
        TicTacToe t = new TicTacToe(zeichen1, zeichen2);
        t.printBoard();
        Scanner sc = new Scanner(System.in);
        System.out.println("Willkommen, wer schummelt setzt aus!");
        while (!t.hasWon(zeichen1) && !t.hasWon(zeichen2) && rundeCounter < 9) {
            boolean korrekterZug;

            if (rundeCounter % 2 == 0) {
                System.out.println("In welche Zeile soll das Zeichen gesetzt werden?");
                int zeile = sc.nextInt();
                System.out.println("In welche Spalte soll das Zeichen gesetzt werden?");
                int spalte = sc.nextInt();
                System.out.println("du hast zeile " + zeile + " und spalte " + spalte + " gewählt");
                korrekterZug = (t.place(zeichen1, zeile, spalte));
                if (korrekterZug) {
                    rundeCounter++;
                } else {
                    System.out.println("Schummeln ist nicht erlaubt!");
                }
            } else {
                simuliereZug(t, zeichen2);
                rundeCounter++;
            }
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
        System.out.println("Der Computer hat die Zeile "+zeile+" und die Spalte "+spalte+" gewählt.");
    }
}
