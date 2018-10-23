package ticTacToe;

public class TicTacToe {

    private Mark[][] ary = new Mark[3][3];
    private Mark zeichen1 ,zeichen2;
    /** Konstruktor */
    public TicTacToe(Mark x, Mark o){
        zeichen1 = new Mark('x');
        zeichen2 = new Mark('o');
    }

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

    /** stellt das Aktuelle TicTacToe Feld in der Console dar. */
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

    /** stellt den Zeileninhalt des TicTacToe Feldes dar. */
    private void printLine(int anzahlZeichen){
        String strich;
        StringBuilder leerzeichenBuilder = new StringBuilder();
        for(int i = 0; i <= anzahlZeichen;i++){
            leerzeichenBuilder.append("-------");
        }
        strich=leerzeichenBuilder.toString();

        System.out.println(""+strich);
    }

    /** stellt die Spalten des TicTacToe Feldes dar.
     * Methode schreiben die uns Leerzeichen bzw Strich liefert */
    private void printRows(int zeile, int anzahlZeichen){
        String zeichen;
        System.out.print("|");
        String leerzeichen;
        StringBuilder leerzeichenBuilder = new StringBuilder(" ");
        if (anzahlZeichen==0){
            leerzeichen = "";
        } else {
            for(int i = 0; i < anzahlZeichen;i++){
                leerzeichenBuilder.append(" ");
            }
            leerzeichen=leerzeichenBuilder.toString();
        }
        for(int i = 0; i<3;i++){
            if(ary[zeile][i]==null){
                zeichen=" ";
            } else {
                zeichen = ary[zeile][i].toString();
            }
            System.out.print(leerzeichen+zeichen+leerzeichen+"|");
        }
        System.out.println(" ");
    }
}
