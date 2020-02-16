
package poo;

import java.util.Scanner;

public class Ex2Aul4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Baskara objBaskara = new Baskara();
        System.out.println("Entre com valor de a:");
        objBaskara.a = entrada.nextDouble();
        System.out.println("Entre com valor de b:");
        objBaskara.b = entrada.nextDouble();
        System.out.println("Entre com valor de c:");
        objBaskara.c = entrada.nextDouble();
        System.out.println("Delta: "+objBaskara.calcularDelta());
        System.out.println(objBaskara.Resultado());
    }
    
}
