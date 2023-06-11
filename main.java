import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        //Variables contenedoras de metodos por teclado
        Scanner entrada = new Scanner(System.in);

        //Instancias
        figuras3D icosaedro = new figuras3D(6.7f);
        figuras3D cono = new figuras3D(25.5f, 10.7f);
        figuras3D prisma1 = new figuras3D(9,10,11);

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
            System.out.println("Usted ha seleccionado la Piramide ");
            System.out.println("Ingrese la altura de la pirámide:");
            double altura = scanner.nextDouble();
            System.out.println("Ingrese la longitud de la base de la pirámide:");
            double base = scanner.nextDouble();
            System.out.println("Ingrese la longitud del apotema de la pirámide:");
            double apotema = scanner.nextDouble();
            piramide piramide = new piramide(altura, base, apotema);
            double area = piramide.calcularArea();
            double perimetro = piramide.calcularPerimetro();
            System.out.println("El área de la pirámide es: " + area);
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
                break;

            case 5:
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
                //float data = entrada.nextFloat();

                icosaedro.imprimir_datos_Icosaedro();
                break;

            default:
                System.out.println("-----> ERROR!! \nEl numero de figura seleccionada no exsite. Intentelo nuevamente!");
                break;
        }

    }
}
