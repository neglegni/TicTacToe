package ticTacToe;

import java.util.Scanner;

public class TicTacToeDialog {



    public static void main(String[] args){
        Mark zeichen1 = new Mark('x');
        Mark zeichen2 = new Mark('o');
        int rundeCounter = 0;
        TicTacToe t = new TicTacToe(zeichen1,zeichen2);
        t.printBoard();
        Scanner sc = new Scanner(System.in);
        while(!t.hasWon(zeichen1)&&!t.hasWon(zeichen2)&&rundeCounter<9) {
            System.out.println("In welche Zeile soll das Zeichen gesetzt werden?");
            int zeile = sc.nextInt();
            System.out.println("In welche Spalte soll das Zeichen gesetzt werden?");
            int spalte = sc.nextInt();
            System.out.println("du hast zeile " + zeile + " und spalte " + spalte + " gewählt");

            if (rundeCounter%2==0){
                t.place(zeichen1, zeile, spalte);
            } else {
                t.place(zeichen2, zeile, spalte);
            }
            t.printBoard();

            rundeCounter++;
            if (rundeCounter == 9){
                System.out.println("Unentschieden, Spiel vorbei!");
            }
        }
        sc.close();
    }

}
