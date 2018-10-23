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

    /** prüft ob eine Eingabe zu einem Sieg führt. */
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
        printLine();
        printRows(0);
        printLine();
        printRows(1);
        printLine();
        printRows(2);
        printLine();
    }

    /** stellt den Zeileninhalt des TicTacToe Feldes dar. */
    private void printLine(){
        System.out.println("-------------");
    }

    /** stellt die Spalten des TicTacToe Feldes dar. */
    private void printRows(int zeile){
        String zeichen;
        System.out.print("|");
        for(int i = 0; i<3;i++){
            if(ary[zeile][i]==null){
                zeichen=" ";
            } else {
                zeichen = ary[zeile][i].toString();
            }
            System.out.print(" "+zeichen+" |");
        }
        System.out.println("");
    }
}
