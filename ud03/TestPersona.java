package ud03;

public class TestPersona {
    public static void main(String[] args) {
        Persona julito;
        Persona outro;
        Persona fulano = new Persona();
        
        julito = new Persona("Julito", "Bla");
        outro = new Persona("Pepito", "Blu");

        //julito = null;

        //outro.nome = "Julito";
        //outro.correo = "fjba@ugb";
        outro.toString();
    }
}
