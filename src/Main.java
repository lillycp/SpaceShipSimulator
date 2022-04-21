import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SpaceShip nave = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Creación de Nave Espacial: \n" +
            "Tipo de Nave a crear: \n" +
            "1. SpacheShip \n" +
            "2. Cargo");
        int tipoNave = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el nombre de la Nave: ");
        String nombre = sc.next();

        System.out.println("Introduce la matrícula de la Nave: ");
        String matricula = sc.next();

        if (tipoNave == 1) {

            nave = new SpaceShip(nombre, matricula);

        } else if(tipoNave == 2){

            System.out.println("Introduce la carga máxima de la Nave: ");
            int cargaMaxima = sc.nextInt();

            nave = new Cargo(nombre, matricula, cargaMaxima);

        } else {
            System.out.println("Valor introducido no válido");
        }

        Boolean estadoMenu = true;

        while (estadoMenu == true) {

            System.out.println(nave);
            System.out.println("¿Que quieres hacer con tu nave?: ");
            System.out.println(" 1. Acelerar");
            System.out.println(" 2. Frenar");
            System.out.println(" 3. Parar" + "\n");
            System.out.println(" 0. Salir");
            int opcionUsuario = sc.nextInt();

            switch (opcionUsuario) {
                case 1:
                    System.out.println("¿Cúanto quieres hacelerar?");
                    float aceleracion = sc.nextFloat();
                    nave.speedUp(aceleracion);
                    break;
                case 2:
                    nave.brake();
                    break;
                case 3:
                    nave.emergencyStop();
                    break;
            }

            if(opcionUsuario == 0) {
                estadoMenu = false;
            }

        }
    }
}
