// Trabajo Práctico 1 - Introducción a Java
// Autor: Diego

import java.util.Scanner;

public class TrabajoPractico {

    // Ejercicio 2: Hola Mundo
    public static void ejercicio2() {
        System.out.println("Hola, Java");
    }

    // Ejercicio 3: Declarar variables
    public static void ejercicio3() {
        String nombre = "Diego";
        int edad = 22;
        double altura = 1.75;
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Estudiante: " + estudiante);
    }

    // Ejercicio 4: Leer nombre y edad
    public static void ejercicio4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Ejercicio 5: Operaciones matemáticas
    public static void ejercicio5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
    }

    // Ejercicio 6: Caracteres de escape
    public static void ejercicio6() {
        System.out.println("Nombre: Juan Perez\nEdad: 30 anios\nDireccion: \"Calle Falsa 123\"");
    }

    // Ejercicio 7: Expresiones e instrucciones
    public static void ejercicio7() {
        int x = 10; // instruccion con expresión "10"
        x = x + 5;  // instruccion con expresión "x + 5"
        System.out.println(x); // instrucción
    }

    // Ejercicio 8: Conversiones de tipo
    public static void ejercicio8() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el divisor: ");
        int b = scanner.nextInt();

        int resultadoInt = a / b;
        double resultadoDouble = (double) a / b;

        System.out.println("Resultado con int: " + resultadoInt);
        System.out.println("Resultado con double: " + resultadoDouble);
    }

    // Ejercicio 9: Codigo corregido
    public static void ejercicio9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
    }

    // Ejercicio 10: Prueba de escritorio
    public static void ejercicio10() {
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        // Llamar a los métodos de cada ejercicio según se desee probar
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }
}
