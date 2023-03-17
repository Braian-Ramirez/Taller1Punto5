import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float numero, resultado;
        int contador = 1;
        Scanner scan = new Scanner(System.in);
        try {
            while (contador <= 6) {
                System.out.println("Ingrese un valor númerico entre 15,12 y 19,31: ");
                numero = scan.nextFloat();
                if (numero >= 15.12 && numero <= 19.31) {
                    resultado = ((numero * 100) / 2) + 100;
                    System.out.println("El resultado de la operación es : " + resultado);
                    contador ++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }
    }
}