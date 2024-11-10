package testIdentifier;

import java.util.Scanner;

public class IdentifierMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o identificador para validar:");
        String input = scanner.nextLine();

        Identifier id = new Identifier();
        if (id.validateIdentifier(input)) {
            System.out.println("Valido");
        } else {
            System.out.println("Invalido");
        }

        scanner.close();
    }
}
