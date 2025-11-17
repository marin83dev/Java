package JAVA.calculadora2;
import java.util.Scanner;

public class calculadora2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operar = 0;
        while (operar != 5) {
            System.out.print("Ingresa un número: ");
            float num1 = scan.nextFloat();

            System.out.print("Ingresa otro número: ");
            float num2 = scan.nextFloat();

            System.out.print("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                ¿Qué quieres hacer?: """);
            operar = scan.nextInt();

            float resultado = 0;

            switch (operar) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.println("Suma: " + resultado);
                }
                case 2 -> {
                    resultado = num1 - num2;
                    System.out.println("Resta: " + resultado);
                }
                case 3 -> {
                    resultado = num1 * num2;
                    System.out.println("Multiplicación: " + resultado);
                }
                case 4 -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("División: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir por cero");
                        continue;
                    }
                }
                case 5 -> {
                    System.out.println("Cerrando programa...");
                    break;
                }
                default -> {
                    System.out.println("Opción no válida");
                    continue;
                }
            }

            if (operar == 5) break;

            int resultadoEntero = (int) resultado;
            switch (resultadoEntero) {
                case 1 -> System.err.println("Por el culo te vacuno");
                case 2 -> System.err.println("Te la meto como un Dios");
                case 3 -> System.err.println("Te la melo del revés");
                // ... (resto de rimas aquí)
                default -> System.err.println("No me sé la rima de ese número");
            }

            System.err.println(); // Línea vacía entre ciclos
        }

        scan.close();
    }
}
