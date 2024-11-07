public class Suma {
    public static void main(String[] args) {
    
    double numero1, numero2, numero3
        // convertir argumentos a numeros
    numero1 = Double.parseDouble(args[0]) ;
    numero2 = Double.parseDouble(args[1]) ;

    if(args.length == 3) {
        numero2 = Double.parseDouble(args[2]) ;
        suma = numero1 + numero2 + numero3
    }
    
    // calcular suma
    double suma = numero1 + numero2;
    
    // Imprimir resultado
    System.out.println(suma);
    }
}