public class figuras3D {
    //Atributos-----------------------------------------------------------
    private float a;
    private double pi=3.1416; //Variable Pi necesario para calculos
    private float radio_base_cono; //Atributo necesario para el cono
    private float altura_cono; // Atributo necesario para el cono
    private double base_prisma; //Atributo necesario para el prisma
    private double altura_prisma; //Atributo necesario para el prisma
    private double profundidad_prisma; //Atributo necesario para el prisma
    private float altura_piramide; //Atributos para piramide
    private float base_piramide;
    private float apotema_piramide;

    //Atributos para el cilidro
    private int altura_cilindro;
    private int base_cilindro;
    private int radio_cilindro;

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

    //Erick Villarroel
    public figuras3D(float altura_piramide, float apotema_piramide, float base_piramide) {
        this.altura_piramide = altura_piramide;
        this.base_piramide = base_piramide;
        this.apotema_piramide = apotema_piramide;
    }

    //Melany Barrera------------------------------------------------------
    public figuras3D(int altura_cilindro, int base_cilindro, int radio_cilindro) {
        this.altura_cilindro = altura_cilindro;
        this.base_cilindro = base_cilindro;
        this.radio_cilindro = radio_cilindro;
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

    //Erick Villarroel-----------------------------------------------
    public float getAltura_piramide() {
        return altura_piramide;
    }

    public void setAltura_piramide(float altura_piramide) {
        this.altura_piramide = altura_piramide;
    }

    public float getBase_piramide() {
        return base_piramide;
    }

    public void setBase_piramide(float base_piramide) {
        this.base_piramide = base_piramide;
    }

    public float getApotema_piramide() {
        return apotema_piramide;
    }

    public void setApotema_piramide(float apotema_piramide) {
        this.apotema_piramide = apotema_piramide;
    }

    public double calcularArea() {
        double areaBase = base_piramide * base_piramide;
        double areaLateral = (base_piramide * apotema_piramide) / 2;
        return areaBase + areaLateral;
    }

    public double calcularPerimetro() {
        return base_piramide * 4;
    }

    //---------------------------------------------------------------

//cubo
    private float l;//longitud de un lado del cubo
    private float getL() {
        return l;
    }
    private void setL(float l) {
        this.l = l;
    }
    public float areacubo (float l){
        return 6*(l)*(l);
    }
    public float volumencubo (float l){
        return (l)*(l)*(l);
    }

    //Melany Barrera----------------------------------------------------
    public int getAltura_cilindro() {
        return altura_cilindro;
    }

    public void setAltura_cilindro(int altura_cilindro) {
        this.altura_cilindro = altura_cilindro;
    }

    public int getBase_cilindro() {
        return base_cilindro;
    }

    public void setBase_cilindro(int base_cilindro) {
        this.base_cilindro = base_cilindro;
    }

    public int getRadio_cilindro() {
        return radio_cilindro;
    }

    public void setRadio_cilindro(int radio_cilindro) {
        this.radio_cilindro = radio_cilindro;
    }

    //Metodos para calcular areas y volumen del cilidro

    private float arealateral(){
        return (float) (2*Math.PI*radio_cilindro*altura_cilindro);
    }
    private float areatotal_cilindro(){
        return (float) (2*Math.PI*radio_cilindro*(altura_cilindro+radio_cilindro));
    }

    private float volumen_cilndro(){
        return (float) (Math.PI*Math.pow(radio_cilindro, 2.*altura_cilindro));
    }

    public void imprimirDatos_cilindro(){
        System.out.println("\nEl área lateral del cilindro es: " + arealateral());
        System.out.println("El área total del cilindro es: " + areatotal_cilindro());
        System.out.println("El volumen del cilindro es: " + volumen_cilndro());
    }

    //------------------------------------------------------------------
}