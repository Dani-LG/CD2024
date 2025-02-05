package ud03;

public class Test {
    public static void main(String[] args) {
        Persona mengano;

        mengano = new Persona("Pepe", "Gomez", "Castro", "12345678R", "proba@gmail.com", 606604475);
        //mengano.nome = "Pepe";
        //mengano.dni = "12345678R";

        System.out.println(mengano.toString());
    }
    
}
