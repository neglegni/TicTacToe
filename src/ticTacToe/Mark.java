package ticTacToe;

import java.util.Objects;

public class Mark {

    private char zeichen;

    /** Konstruktor */
    public Mark(char zeichen){
        this.zeichen = zeichen;
    }

    /** Gibt das interne Zeichen der Klasse Mark zurück */
    public char getZeichen() {
        return zeichen;
    }

    /** Vergleicht zwei Marks miteinander und gibt true zurück,
     *  sofern die Zeichen gleich sind, sonst false */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark = (Mark) o;
        return zeichen == mark.zeichen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zeichen);
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
