package ud03;

import java.util.Date;

public class Profesor extends Persona {

    // Atributos
    String especialidad;
    String cuerpo;
    Boolean sustituto;
    Date fecOposicion;
    // Métodos

    

    public String getEspecialidad() {
        return especialidad;
    }

    public Profesor(String dni, String nome, String apellido1, String apellido2, String correo, Integer movil,
            Date fecNacimiento, String especialidad, String cuerpo, Boolean sustituto, Date fecOposicion) {
        super(dni, nome, apellido1, apellido2, correo, movil, fecNacimiento);
        this.especialidad = especialidad;
        this.cuerpo = cuerpo;
        this.sustituto = sustituto;
        this.fecOposicion = fecOposicion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Boolean getSustituto() {
        return sustituto;
    }

    public void setSustituto(Boolean sustituto) {
        this.sustituto = sustituto;
    }

    public Date getFecOposicion() {
        return fecOposicion;
    }

    public void setFecOposicion(Date fecOposicion) {
        this.fecOposicion = fecOposicion;
    }

    @Override
    public String toString() {
        return "Profesor [especialidad=" + especialidad + ", cuerpo=" + cuerpo + ", sustituto=" + sustituto
                + ", fecOposicion=" + fecOposicion + "]";
    }
    
}
