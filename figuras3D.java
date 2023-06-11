public class figuras3D {

    //Atributos-----------------------------------------------------------
   float a;

    //Constructores-------------------------------------------------------
    //Bryan Delgado ---- Constructor de Icosaedro


    public figuras3D(float a) {
        this.a = a;
    }

    //Metodos-------------------------------------------------------------
    //Bryan Delgado
    private float getA() {
        return a;
    }

    private void setA(float a) {
        this.a = a;
    }

    //Metodos especiales----------------------------------------------------------------------------
    //Bryan Delgado *****************************************************
    private float area_Icosaedro(){
        return (float) (5*Math.sqrt(3)*Math.pow(a, 2));
    }

    private float volumen_Icosaedro(){

        double op = (((15*Math.pow(a, 3)) + (Math.sqrt(5)*Math.pow(a, 3)))/12);

        return (float) op;
    }

    public void imprimir_datos_Icosaedro(){
        System.out.println("\nEl area del Icosaedro es: "+area_Icosaedro());
        System.out.println("El volumen del Icosaedro es: "+volumen_Icosaedro());
    }

    //********************************************************************
}
