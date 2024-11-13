import java.util.Scanner;

public class InformacionPersonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Introduzca palabra 1: ");
        String palabra1 = scanner.nextLine();

        System.out.printf("Introduzca palabra 2: ");
        String palabra2 = scanner.nextLine();

        System.out.printf("Introduzca palabra 3: ");
        String palabra3 = scanner.nextLine();

        // Para mostrar solo la primera y tercera palabra, puedes omitir la segunda
        System.out.println(palabra1 + palabra2 + palabra3);
    }
}
