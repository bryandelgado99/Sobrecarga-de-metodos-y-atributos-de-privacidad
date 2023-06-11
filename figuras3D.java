public class figuras3D {
    //Atributos-----------------------------------------------------------
    float a;
    private double pi=3.1416; //Variable Pi necesario para calculos
    private float radio_base_cono; //Atributo necesario para el cono
    private float altura_cono; // Atributo necesario para el cono
    private double base_prisma; //Atributo necesario para el prisma
    private double altura_prisma; //Atributo necesario para el prisma
    private double profundidad_prisma; //Atributo necesario para el prisma

    //Constructores-------------------------------------------------------
    //Bryan Delgado ---- Constructor de Icosaedro
    public figuras3D(float a) {
        this.a = a;
    }
    //Heyer Tinoco ---- Constructores Cono
    public figuras3D(float radio_base_cono, float altura_cono) {
        this.radio_base_cono = radio_base_cono;
        this.altura_cono = altura_cono;
    }
    //Martin Jimenez --- Constructores prisma
    // Constructor con argumentos
    public figuras3D(double base_prisma, double altura_prisma, double profundidad_prisma) {
        this.base_prisma = base_prisma;
        this.altura_prisma = altura_prisma;
        this.profundidad_prisma = profundidad_prisma;
    }

    //Metodos-------------------------------------------------------------
    //Bryan Delgado
    private float getA() {
        return a;
    }
    private void setA(float a) {
        this.a = a;
    }
    //Heyer Tinoco
    private float getRadio_base_cono() {return radio_base_cono;}
    private void setRadio_base_cono(float radio_base_cono) {this.radio_base_cono = radio_base_cono;}
    private float getAltura_cono() {return altura_cono;}
    private void setAltura_cono(float altura_cono) {this.altura_cono = altura_cono;}
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
    //Heyer Tinoco*******************************************************
    private float area_base_cono(){ //Calculo necesario para calcular el area del cono
        double aux = getRadio_base_cono()*getRadio_base_cono();
        return (float) (pi*aux);
    }
    private float area_lateral_cono(){ //Calculo necesario para calcular el area del cono
        double aux = getRadio_base_cono()*getRadio_base_cono();
        double aux2= getAltura_cono()*getAltura_cono();
        double s = Math.sqrt(aux+aux2);
        return (float) (pi*getRadio_base_cono()*s);
    }
    private float area_total_cono(){ //Area TOTAL del cono
        return (area_base_cono()+area_lateral_cono());
    }
    private float volumen_cono(){ //Volumen Cono
        double aux = getRadio_base_cono()*getRadio_base_cono();
        return (float) ((1/3)*pi*aux*getAltura_cono());
    }
    public void imprimir_datos_cono(){
        System.out.println("\nEl área total de un cono es: " +area_total_cono());
        System.out.println("El volumen del cono es: "+volumen_cono());
    }
    //Martin Jimenez********************************************************************
    public void setBase(double base_prisma) {
        this.base_prisma = base_prisma;
    }

    public double getBase() {
        return base_prisma;
    }

    // Setter y Getter para la altura del prisma
    //Martin Jimenez
    public void setAltura(double altura_prisma) {
        this.altura_prisma = altura_prisma;
    }

    public double getAltura() {
        return altura_prisma;
    }

    // Setter y Getter para la profundidad del prisma
    //Martin Jimenez
    public void setProfundidad(double profundidad_prisma) {
        this.profundidad_prisma = profundidad_prisma;
    }

    public double getProfundidad() {
        return profundidad_prisma;
    }

    // Método para calcular el área de la base
    public double calcularAreaBase() {
        return base_prisma * base_prisma;
    }

    // Método para calcular el área lateral
    public double calcularAreaLateral() {
        return 2 * base_prisma * altura_prisma + 2 * base_prisma * profundidad_prisma;
    }

    // Método para calcular el área total
    public double calcularAreaTotal() {
        return calcularAreaBase() + calcularAreaLateral();
    }

    // Método para calcular el volumen
    public double calcularVolumen() {
        return base_prisma * altura_prisma * profundidad_prisma;
    }

}