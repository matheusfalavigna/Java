
package poo;

import java.util.Scanner;

public class Ex1Aul2 {
    public static void main(String[] args) {
      int mes;  
      Scanner ent = new Scanner(System.in);
        System.out.println("Digite o mês desejado: ");
        mes = ent.nextInt();
        getMesPorExtenso(mes);
        }
    static void getMesPorExtenso(int mes){
        int id;
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o idioma desejado 1(Português)e 2(Inglês): ");
        id = ent.nextInt();
        if(id == 1){
        String meses [] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro",
        "Outubro","Novembro","Dezembro"};
        switch(mes){
            case 1:
                System.out.println(meses[0]);
                break;
            case 2:
                System.out.println(meses[1]);
                break;
            case 3:
                System.out.println(meses[2]);
                break;
            case 4:
                System.out.println(meses[3]);
                break;
            case 5:
                System.out.println(meses[4]);
                break;
            case 6:
                System.out.println(meses[5]);
                break;
            case 7:
                System.out.println(meses[6]);
                break;  
            case 8:
                System.out.println(meses[7]);
                break;  
            case 9:
                System.out.println(meses[8]);
                break; 
            case 10:
                System.out.println(meses[9]);
                break;  
            case 11:
                System.out.println(meses[10]);
                break;  
            case 12:
                System.out.println(meses[11]);
                break; 
        }
        }
        if(id == 2){
        String meses [] = {"January","February","March","April","May","June","July","Agust","September",
        "Octuber","November","December"};
        switch(mes){
            case 1:
                System.out.println(meses[0]);
                break;
            case 2:
                System.out.println(meses[1]);
                break;
            case 3:
                System.out.println(meses[2]);
                break;
            case 4:
                System.out.println(meses[3]);
                break;
            case 5:
                System.out.println(meses[4]);
                break;
            case 6:
                System.out.println(meses[5]);
                break;
            case 7:
                System.out.println(meses[6]);
                break;  
            case 8:
                System.out.println(meses[7]);
                break;  
            case 9:
                System.out.println(meses[8]);
                break; 
            case 10:
                System.out.println(meses[9]);
                break;  
            case 11:
                System.out.println(meses[10]);
                break;  
            case 12:
                System.out.println(meses[11]);
                break; 
        }
        }
        
        
    } 
    
}