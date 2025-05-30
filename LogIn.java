import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.
        // Datos correctos
        String correctUsername = "admin";
        String correctPassword = "1234";

        // Solicitar usuario (sin salto de línea)
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Solicitar contraseña (sin salto de línea)
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Verificar usuario y contraseña
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta.");
        }

        scanner.close();
    }
}
