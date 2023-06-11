import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        //Variables contenedoras de metodos por teclado
        Scanner entrada = new Scanner(System.in);

        //Instancias
        figuras3D icosaedro = new figuras3D(6.7f);

        //Menu principal
        System.out.println("------------- Bienvenido a 3DForms --------------");
        System.out.println("\nEste programa permite conocer el area de una figura tridimensional dado los datos requeridos. Las figuras del sistema son:");

        System.out.println("\n-----> 1. Piramide");
        System.out.println("-----> 2. Esfera");
        System.out.println("-----> 3. Prima");
        System.out.println("-----> 4. Cilindro");
        System.out.println("-----> 5. Cubo");
        System.out.println("-----> 6. Cono");
        System.out.println("-----> 7. Icosaedro");

        System.out.println("\nPara continuar, por favor seleccione una de las siguientes opciones: ");
        int option = entrada.nextInt();

        //Switch de opciones
        /*
         * En el menu del switch , agregar los llamados a los metodos de cada figura que realicen.*/

        switch (option) {
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            case 7: //Icosaedro
                System.out.println("\n------> Ha seleccionado el Icosaedro");

                System.out.println("\nPor favor, ingrese el valor de a, correspondiente a la longitud de la arista: ");
                //float data = entrada.nextFloat();

                icosaedro.imprimir_datos_Icosaedro();
                break;

            default:
                System.out.println("-----> ERROR!! \nEl numero de figura seleccionada no exsite. Intentelo nuevamente!");
                break;
        }

    }
}
