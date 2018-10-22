package ticTacToe;

public class TicTacToe {

    private Mark[][] ary = new Mark[3][3];

    /** Konstruktor */
    public TicTacToe(){

    }

    /** platziert ein Zeichen an eine die angegebene Stelle;
     *  bei Erfolg -> return true. */
    public boolean place(Mark zeichen, int zeile, int spalte) {
        if (ary[zeile][spalte]!=null && zeile < 0 && zeile > 2&& spalte < 0 && spalte >2) {
                return false;
        } else {
            ary[zeile][spalte]=zeichen;
            return true;
        }
    }

    /** prüft ob eine Eingabe zu einem Sieg führt. */
    public boolean hasWon(Mark zeichen, int zeile, int spalte){
        return true;
    }

    /** stellt das Aktuelle TicTacToe Feld in der Console dar. */
    public void printBoard(){
        System.out.println("");
    }

    /** stellt den Zeileninhalt des TicTacToe Feldes dar. */
    public void printLine(){
        System.out.println("");
    }

    /** stellt die Spalten des TicTacToe Feldes dar. */
    public void printRows(){
        System.out.println("");
    }
}
