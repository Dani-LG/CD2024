package ud03;

import java.util.Date;

public class Persona {

    // Atributos
    private String dni;
    private String nome;
    private String apellido1;
    private String apellido2;
    private String correo;
    private Integer movil;
    private Date fecNacimiento;
    // Métodos
    // Constructores

    

    public String getDni() {
        return dni;
    }

    public Persona(String dni, String nome, String apellido1, String apellido2, String correo, Integer movil,
            Date fecNacimiento) {
        this.dni = dni;
        this.nome = nome;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correo = correo;
        this.movil = movil;
        this.fecNacimiento = fecNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getMovil() {
        return movil;
    }

    public void setMovil(Integer movil) {
        this.movil = movil;
    }

    public Date getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", nome=" + nome + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
                + ", correo=" + correo + ", movil=" + movil + ", fecNacimiento=" + fecNacimiento + "]";
    }

   
}