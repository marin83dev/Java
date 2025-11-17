import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Whats ur name? ");
        String nombre = scan.nextLine();
        System.out.println("Hola, "+ nombre + "!");
        scan.close();
    }
}