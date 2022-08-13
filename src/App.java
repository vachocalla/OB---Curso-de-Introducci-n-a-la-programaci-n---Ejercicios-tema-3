public class App {
    public static void main( String args[] ){
        int a, b, c;
        a = 7;
        b = 9;
        c = 10;
        sumar(a, b, c);

        Coche coche =  new Coche();

        coche.incrementarNumeroPuertas();
        System.out.println("Numero de puertas: " + coche.getNumeroPuertas() );
    }

    private static void sumar(int a, int b, int c){
        int s = a + b + c;
        System.out.println("La suma de " + a + "+" + b + "+" + c +" es: "+ s);
    }
}
class Coche{
    // atributos
    private Integer numeroPuertas;

    // constructores
    public Coche(){
        this.numeroPuertas = 0;
    }

    public Coche( Integer numeroPuertas ){
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas(){
        return numeroPuertas;
    }

    // metodos
    public void incrementarNumeroPuertas(){
        this.numeroPuertas += 1;
    }
}