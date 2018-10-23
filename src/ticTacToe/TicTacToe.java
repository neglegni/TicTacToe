package ticTacToe;

public class TicTacToe {

    /** Instanzvariablen */
    private Mark[][] ary = new Mark[3][3];

    /** platziert ein Zeichen an eine die angegebene Stelle;
     *  bei Erfolg -> return true. */
    public boolean place(Mark zeichen, int zeile, int spalte) {
        if (ary[zeile][spalte]==null && zeile >= 0 && zeile <= 2&& spalte >= 0 && spalte <=2) {
            ary[zeile][spalte]=zeichen;
            return true;
        } else {
            return false;
        }
    }

    /** prüft ob eine Eingabe zu einem Sieg führt.
     * For-Schleife basteln*/

    public boolean hasWon(Mark zeichen){
        if (ary[0][0]== zeichen && ary[1][1]== zeichen && ary[2][2]== zeichen){
            return true;
        } else if (ary[0][2]== zeichen && ary[1][1]== zeichen && ary[2][0]== zeichen){
            return true;
        } else if (ary[0][0]== zeichen && ary[0][1]== zeichen && ary[0][2]== zeichen){
            return true;
        } else if (ary[1][0]== zeichen && ary[1][1]== zeichen && ary[1][2]== zeichen){
            return true;
        } else if (ary[2][0]== zeichen && ary[2][1]== zeichen && ary[2][2]== zeichen){
            return true;
        } else if (ary[0][0]== zeichen && ary[1][0]== zeichen && ary[2][0]== zeichen){
            return true;
        } else if (ary[0][1]== zeichen && ary[1][1]== zeichen && ary[2][1]== zeichen){
            return true;
        } else if (ary[0][2]== zeichen && ary[1][2]== zeichen && ary[2][2]== zeichen){
            return true;
        } else  {
            return false;
        }
    }

    /** stellt das Aktuelle TicTacToe Feld in der Konsole dar. */
    public void printBoard(){
        int anzahlZeichen = 3;
        printLine(anzahlZeichen);
        printRows(0,anzahlZeichen);
        printLine(anzahlZeichen);
        printRows(1,anzahlZeichen);
        printLine(anzahlZeichen);
        printRows(2,anzahlZeichen);
        printLine(anzahlZeichen);
    }

   public String charMultiplikator(int anzahlZeichen,char c){
        String mult = "";
        for (int i =0; i < anzahlZeichen; i++) {
                     mult+=c;
        }
        return mult;
    }

    /** stellt den Zeileninhalt des TicTacToe Feldes dar. */
    private void printLine(int anzahlZeichen){
        System.out.println(this.charMultiplikator(anzahlZeichen*ary.length+2,'-'));
    }

    /** stellt die Spalten des TicTacToe Feldes dar.
     * Methode schreiben die uns Leerzeichen bzw Strich liefert */
    private void printRows(int zeile, int anzahlZeichen){
        System.out.print("|");
        for(int i = 0; i<3;i++){
            if(ary[zeile][i]==null){
                System.out.print(charMultiplikator(anzahlZeichen,' '));
            } else {
                System.out.print(charMultiplikator(anzahlZeichen/2,' '));
                System.out.print(ary[zeile][i]);
                System.out.print(charMultiplikator(anzahlZeichen/2,' '));
            }
        }
        System.out.println("|");
    }
}
