
package poo;

import java.util.Random;


public class Ex4 {
   public static void main(String[] args){
   int [][] numerosaleatorios = new int [40][40];
   Random numerorandom = new Random();
   for(int i=0; i < numerosaleatorios.length;i++){
      for(int j=0;j<numerosaleatorios[i].length;j++){
          numerosaleatorios[i][j] = numerorandom.nextInt(255);
      } 
   }
       for(int i=0; i < numerosaleatorios.length;i++){
      for(int j=0;j<numerosaleatorios[i].length;j++){
       System.out.println(numerosaleatorios[i][j]); 
   }
}
   }
}