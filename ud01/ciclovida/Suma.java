public class Suma {
    public static void main(String[] args) {
    
    // convertir argumentos a numeros
    double numero1 = Double.parseDouble(args[0]) ;
    double numero2 = Double.parseDouble(args[1]) ;
    
    // calcular suma
    double suma = numero1 + numero2;
    
    // Imprimir resultado
    System.out.println(suma);
    }
}