package clases;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("¿El numero 6 es par? " + Algoritmos.esPar(6));
        System.out.println("¿El numero 13 es par? " + Algoritmos.esPar(13));

        System.out.println("¿El numero 29 es primo? " + Algoritmos.esPrimo(29));
        System.out.println("¿El numero 3 es primo? " + Algoritmos.esPrimo(3));
        System.out.println("¿El numero 4 es primo? " + Algoritmos.esPrimo(4));

        System.out.println("Reversa de 'Palabra' es: " + Algoritmos.stringEnReversa("Palabra"));
        System.out.println("Reversa de 'Morales' es: " + Algoritmos.stringEnReversa("Morales"));

        System.out.println("¿La palabra 'salas' es palíndromo? " + Algoritmos.esPalindromo("salas"));
        System.out.println("¿La palabra 'lugar' es palíndromo? " + Algoritmos.esPalindromo("lugar"));

        System.out.println("Secuencia FizzBuzz hasta 20:");
        Algoritmos.secuenciaFizzBuzz(20);
    }
}
