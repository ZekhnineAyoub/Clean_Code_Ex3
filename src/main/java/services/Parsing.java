package services;

import java.util.List;

public class Parsing {

    private int value;

    public Parsing(int value) {
        this.value = value;
    }

    public void affichage(){
       System.out.println("parsed value = "+this.value);
    }



    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
