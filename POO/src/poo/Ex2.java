
package poo;

import java.util.Scanner;

public class Ex2 {
   public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = 10;
    int r[] = new int[n];
    int i;
    for (i=0; i<n; i++) {
      System.out.print("Informe o "+ (i+1)+ "º valor das "+ 10+" resistêcias : ");
      r[i] = ler.nextInt();
    }
    int soma = 0;
    int menor = r[0];
    int maior = r[0];
    for (i=0; i<n; i++) {
      soma = soma + r[i];
      if (r[i] < menor)
         menor = r[i];
      if (r[i] > maior)
         maior = r[i];
    }
    System.out.printf("\n");
    for (i=0; i<n; i++) {
      if (r[i] == menor)
        System.out.println("A resistência que apresenta o menor valor é a: "+ i+"("+ r[i]+")");
      else if (r[i] == maior)
        System.out.println("A resistência que apresenta o maior valor é a: "+ i+"("+ r[i]+")");
    }
 
    System.out.println("Resistência equivalente = " + soma);
  }
}
