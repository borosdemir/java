import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Selecciona el numero de la opcion deseada: ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Anime");
            System.out.println("0. Salir");

            // Si queremos leer el teclado desde java usaremos Scanner
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos :) ");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                case 3:
                    System.out.println("Anime");
                    break;
                default:
                    System.out.println("Porfavor elige entre las opciones");
            }
        }while (response !=0);
        System.out.println("Game Over");
    }
}
