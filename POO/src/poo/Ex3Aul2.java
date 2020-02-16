
package poo;

import java.util.Scanner;

public class Ex3Aul2 {
    public static void main(String[] args) {
      char caracter; 
      Scanner ent = new Scanner(System.in);
        System.out.println("Digite um caractere qualquer para saber se é letra do alfabeto ou não: ");
        caracter = ent.nextLine().charAt(0);
        isLetra(caracter);
        }
    static void isLetra(char caracter){
        boolean letra = true;
        boolean nletra = false;
        if(caracter >= 65 && caracter<91 || caracter >= 97 && caracter <= 122 ){
            System.out.println(letra);
        }
        else{
            System.out.println(nletra);
        }
    }
}
