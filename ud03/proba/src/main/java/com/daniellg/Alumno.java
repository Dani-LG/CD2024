package com.daniellg;

import java.time.LocalDate;

public class Alumno extends Persona {
    private String codigoXade;
    private boolean autorizaTutores;

    public Alumno(){
        
    }
    public Alumno(String dni, String nome, String apellido1, String apellido2, String correo, Integer movil,
            LocalDate fecNacimiento, String codigoXade, boolean autorizaTutores) {
        super(dni, nome, apellido1, apellido2, correo, movil, fecNacimiento);
        this.codigoXade = codigoXade;
        this.autorizaTutores = autorizaTutores;
    }
    //getters e setters
    public String getCodigoXade() {
        return codigoXade;
    }
    public void setCodigoXade(String codigoXade) {
        this.codigoXade = codigoXade;
    }
    public boolean isAutorizaTutores() {
        return autorizaTutores;
    }
    public void setAutorizaTutores(boolean autorizaTutores) {
        this.autorizaTutores = autorizaTutores;
    }
    //metodo toString
    @Override
    public String toString() {
        return "Alumno [codigoXade=" + codigoXade + ", autorizaTutores=" + autorizaTutores + "]";
    }
}
