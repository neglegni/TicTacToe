package ticTacToe;

public class Mark {

    private char zeichen;

    /** Konstruktor */
    public Mark(char zeichen){
        this.zeichen = zeichen;
    }

    public char getZeichen() {
        return zeichen;
    }

    /** Vergleicht zwei Marks miteinander und gibt true zurück,
     *  sofern die Zeichen gleich sind, sonst false */
    public boolean equals(Mark zeichen){
        if(this.getZeichen()==zeichen.getZeichen()){
            return true;
        } else return false;
    }

    /** Gibt die Länge des Zeichens */
    public int size(){
        return 1;
    }

    /** Gibt den Inhalt des Zeichens zurück */
    @Override
    public String toString(){
        return ""+zeichen;
    }
}
