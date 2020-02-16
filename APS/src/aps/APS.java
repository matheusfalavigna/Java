/* 
 Matheus Felipe Buffon Falavigna 21170095
 Mikael Gomes da Costa 21167418
 Enrico da Sá Pertinhez 21109015
*/


package aps;

import java.util.Scanner;

public class APS {

    
    public static void main(String[] args) {
       int players;
        int tabuleiro;
        int armadilha1,armadilha2,armadilha3;
        int posicao1,posicao2,posicao3;
        tabuleiro = 48;
        players = 1;
        posicao1 = 0;
        posicao2 = 0;
        posicao3 = 0;
        armadilha1 = 15;
        armadilha2 = 23;
        armadilha3 = 36;
        Scanner entrade = new Scanner(System.in);
        while(posicao1 < tabuleiro || posicao2 < tabuleiro || posicao3 < tabuleiro){
            if(players == 1){
              System.out.println("Jogada do player " + players + " , que está no quadrado: " + posicao1);
              int dado1 = (int) (Math.random() *6 + 1);
              System.out.println("Rolando dado 1: " + dado1);
              int dado2 = (int) (Math.random() *6 + 1);
              System.out.println("Rolando dado 2: " + dado2);
              posicao1 = posicao1 + dado1 + dado2;
              System.out.println("Você está na posição: " + posicao1);
              if(posicao1 == armadilha1 || posicao1 == armadilha2 || posicao1 == armadilha3 ){
              posicao1 = posicao1 - dado1 - dado2;
              System.out.println("Você caiu na armadilha!!!");
              }
                if(posicao1 >= 49){
                int pts = posicao1 - tabuleiro ;
                int nposicao = tabuleiro - pts;
                posicao1 = nposicao;
                    System.out.println("Você ultrapassou o limite de " + pts +
                    " ,agora sua posição será " + nposicao );
               }
               if(posicao1 < tabuleiro){
              players ++;
            }
            else
                break;
            }
            if(players == 2){
              System.out.println("Jogada do player " + players + " , que está no quadrado: " + posicao2);
              int dado1 = (int) (Math.random() *6 + 1);
              System.out.println("Rolando dado 1: " + dado1);
              int dado2 = (int) (Math.random() *6 + 1);
              System.out.println("Rolando dado 2: " + dado2);
              posicao2 = posicao2 + dado1 + dado2;
              System.out.println("Você está na posição: " + posicao2);
              if(posicao2 == armadilha1 || posicao2 == armadilha2 || posicao2 == armadilha3 ){
              posicao2 = posicao2 - dado1 - dado2;
              System.out.println("Você caiu na armadilha!!!");
              } 
                if(posicao2 >= 49){
                    int pts = posicao2 - tabuleiro;
                    int nposicao = tabuleiro - pts;
                    posicao2 = nposicao;
                    System.out.println("Você ultrapassou o limite de " + pts +
                    " ,agora sua posição será: " + nposicao);
                 }
                if(posicao2 < tabuleiro){
                  players ++;
              }
              else
                  break;
            }
            if(players == 3){
              System.out.println("Jogada do player " + players + " , que está no quadrado: " + posicao3);
              int dado1 = (int) (Math.random() *6 + 1);
              System.out.println("Rolando dado 1: " + dado1);
              int dado2 = (int) (Math.random() *6 + 1);
              System.out.println("Rolando dado 2: " + dado2);
              posicao3 = posicao3 + dado1 + dado2;
              System.out.println("Você está na posição: " + posicao3);
              if(posicao3 == armadilha1 || posicao3 == armadilha2 || posicao3 == armadilha3 ){
              posicao3 = posicao3 - dado1 - dado2;
              System.out.println("Você caiu na armadilha!!!");
              } 
              if(posicao3 >= 49){
                    int pts = posicao3 - tabuleiro;
                    int nposicao = tabuleiro - pts;
                    posicao3 = nposicao;
                    System.out.println("Você ultrapassou o limite de " + pts +
                    " ,agora sua posição será: " + nposicao);
                 }
              if(posicao3 < tabuleiro){
                  players = 1;
              }
              else
                  break;
            }
        }
        if(posicao1 >= 48){
            System.out.println("Jogador 1 é o vencedor!");
        }
        else if(posicao2 >= 48){
            System.out.println("Jogador 2 é o vencedor!");
        }
        else if(posicao3 >= 48){
            System.out.println("Jogador 3 é o vencedor!");
        }
    }
}
    

