import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        //Variables contenedoras de metodos por teclado
        Scanner entrada = new Scanner(System.in);

        //Instancias
        figuras3D icosaedro = new figuras3D(6.7f);
        figuras3D cono = new figuras3D(25.5f, 10.7f);
        figuras3D prisma1 = new figuras3D(9.10f,11f);
        figuras3D cubo = new figuras3D(5.27f);
        figuras3D cilindro = new figuras3D(12,8,9);

        //Menu principal
        System.out.println("------------- Bienvenido a 3DForms --------------");
        System.out.println("\nEste programa permite conocer el area de una figura tridimensional dado los datos requeridos. Las figuras del sistema son:");

        System.out.println("\n-----> 1. Piramide");
        System.out.println("-----> 2. Esfera");
        System.out.println("-----> 3. Prisma");
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
                System.out.println("-----> Ha seleccionado la Piramide ");
                System.out.println("\nIngrese la altura de la pirámide:");
                double altura = entrada.nextDouble();
                System.out.println("\nIngrese la longitud de la base de la pirámide:");
                double base = entrada.nextDouble();
                System.out.println("\nIngrese la longitud del apotema de la pirámide:");
                double apotema = entrada.nextDouble();
                figuras3D piramide = new figuras3D(altura, base, apotema);
                double area = piramide.calcularArea();
                double perimetro = piramide.calcularPerimetro();
                System.out.println("\nEl área de la pirámide es: " + area);
                System.out.println("El perímetro de la base de la pirámide es: " + perimetro);
                break;

            case 2:
                break;

            case 3:
                Scanner scanner = new Scanner(System.in);
                System.out.println("\n------> Ha seleccionado el Prisma");
                System.out.print("Ingrese el valor de la base: ");
                double base_prisma = scanner.nextDouble();
                System.out.print("Ingrese el valor de la altura: ");
                double altura_prisma = scanner.nextDouble();
                System.out.print("Ingrese el valor de la profundidad: ");
                double profundidad_prisma = scanner.nextDouble();
                System.out.println("Área de la base: " + prisma1.calcularAreaBase());
                System.out.println("Área lateral: " + prisma1.calcularAreaLateral());
                System.out.println("Área total: " + prisma1.calcularAreaTotal());
                System.out.println("Volumen: " + prisma1.calcularVolumen());
                break;

            case 4:
                System.out.println("\n------> Ha seleccionado el Cilindro");

                System.out.println("\nPor favor, ingrese valor de la base del cilindro: ");
                int base_cilidro = entrada.nextInt();

                System.out.println("\nPor favor, ingrese de la altura del cilindro: ");
                int altura_cillindro = entrada.nextInt();

                System.out.println("\nPor favor, ingrese de la altura del cilindro: ");
                int radio_cilindro = entrada.nextInt();

                cilindro.imprimirDatos_cilindro();
                break;

            case 5:
                Scanner scannner = new Scanner(System.in);
                System.out.println("Usted ha seleccionado CUBO ");
                System.out.print("Ingrese el valor del lado del cubo: ");
                float lado = scannner.nextFloat();
                System.out.println("Volumen: " + cubo.volumencubo(lado));
                System.out.println("Areas: " + cubo.areacubo(lado));

                break;

            case 6: //Cono
                System.out.println("\n------> Ha seleccionado el Cono");

                System.out.println("\nPor favor, ingrese el valor del radio de la base del cono: ");
                //float data = entrada.nextFloat();
                System.out.println("\nPor favor, ingrese el valor de la altura del cono: ");
                //float data = entrada.nextFloat();

                //Aqui usamos los setters para darle los valores en caso de entrada, pero ya determinamos en los constructorres arriba por las instancias

                cono.imprimir_datos_cono();
                break;

            case 7: //Icosaedro
                System.out.println("\n------> Ha seleccionado el Icosaedro");

                System.out.println("\nPor favor, ingrese el valor de a, correspondiente a la longitud de la arista: ");
                float a = entrada.nextFloat();

                icosaedro.imprimir_datos_Icosaedro();
                break;

            default:
                System.out.println("-----> ERROR!! \nEl numero de figura seleccionada no exsite. Intentelo nuevamente!");
                break;
        }

    }
}
