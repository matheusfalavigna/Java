
package poo;

import java.util.Scanner;

public class Ex2Aul2 {
    public static void main(String[] args) {
      int hora;  
      Scanner ent = new Scanner(System.in);
        System.out.println("Digite as horas(em segundos) para conversão: ");
        hora = ent.nextInt();
        converterHoras(hora);
        }
    static void converterHoras(int hora){
        int s = hora % 60; 
        int ms = hora / 60; 
        int m = ms % 60; 
        int h = ms / 60; 
        System.out.println(h+":"+m+":"+s);
          
    }
}
