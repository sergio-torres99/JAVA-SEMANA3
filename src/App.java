import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner compra = new Scanner(System.in);
        System.out.println("Ingrese cantidad de la compra: ");
        double cantidadCompra = compra.nextInt();

        int puntosAcumulados = (int)cantidadCompra / 10;
        System.out.println("Sus puntos: " + puntosAcumulados);

        compra.close();

        String nivelFidelizacion = "";

        if (puntosAcumulados > 0 && puntosAcumulados <= 100 ) {
            nivelFidelizacion = "Bronce";
        }else if (puntosAcumulados >= 101 && puntosAcumulados <= 500) {
            nivelFidelizacion = "Plata";
        }else if (puntosAcumulados >= 501 && puntosAcumulados <= 1000){
            nivelFidelizacion = "Oro";
        }else if (puntosAcumulados > 1000) {
            nivelFidelizacion = "Platino";
        }
        System.out.println("Su nivel de fidelizacion es: " + nivelFidelizacion);

        if (nivelFidelizacion == "Oro" || nivelFidelizacion == "Platino") {
            System.out.println("Tienes un 10% de descuento");
        }

        if (nivelFidelizacion == "Platino") {
            System.out.println("Tienes derecho a un cupon para un producto");
        }





    }
}