package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los digitos del juego del gato (X,_,O): ");
        String entrada = scanner.nextLine().toUpperCase();

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c != 'X' && c != 'O' && c != '_') {
                System.out.println("Solo puedes ingresar estos digitos: X,O,_ ");
                return;
            }
        }

        System.out.println(" ---------- ");
        System.out.println(" | " + entrada.charAt(0) + "  " + entrada.charAt(1) + "  " + entrada.charAt(2) + " | ");
        System.out.println(" | " + entrada.charAt(3) + "  " + entrada.charAt(4) + "  " + entrada.charAt(5) + " | ");
        System.out.println(" | " + entrada.charAt(6) + "  " + entrada.charAt(7) + "  " + entrada.charAt(8) + " | ");
        System.out.println(" ---------- ");

    }
}