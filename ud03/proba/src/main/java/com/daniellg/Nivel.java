package com.daniellg;

public class Nivel {
    private String nivel;
    //constructor
    public Nivel(String nivel) {
        this.nivel = nivel;
    }
    public Nivel() {
        
    }
    //getter setter
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    //toString
    @Override
    public String toString() {
        return "Nivel [nivel=" + nivel + "]";
    }
    
}
