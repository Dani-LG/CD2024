package ud03;

import java.util.Date;

public class Persona {

    //Atributos
    String dni;
    String nome;
    String apellido1;
    String apellido2;
    String correo;
    Integer movil;
    Date fecNacimiento;
    //Métodos

    public Persona(){
        
    }
    
    public Persona(String nom, String apel){
        nome = nom;
        apellido1 = apel;

    }
}