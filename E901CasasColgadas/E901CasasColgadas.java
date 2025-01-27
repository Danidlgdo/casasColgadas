package E901CasasColgadas;

import java.util.Scanner;

public class E901CasasColgadas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
            String palabra = teclado.next().toLowerCase();
            if (palabra.equals("colgadas")){
                System.out.println("Bien");
            } else {
                System.out.println("Mal");
            }
        }
        teclado.close();
    }
}
