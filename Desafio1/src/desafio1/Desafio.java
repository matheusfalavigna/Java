package desafio1;

import java.util.Scanner;

public class Desafio {
    public static void impressao(double y){
       System.out.println("A taxa de aprovação foi de: "+ ((y*100)/12)+"%\nOu seja, "+y+ " alunos foram aprovados");
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
 double aprov = 0;
 String resposta[] = new String [8]; //8
 String pergunta[] = new String [8];
 String aluno[] = new String [12]; //11
double Nota[] = new double[12];
 //Aplicando o Gabarito
 for (int cont = 0; cont <= 7; cont++){
        System.out.println("Digite o gabarito da prova:\nQuestão " + (cont+1)+":");
        pergunta[cont]= x.next();
    }
 //Perguntando O RA e atribuindo a nota do aluno
 for (int cont = 0; cont < 12; cont++ ){
     System.out.println("Digite o Ra do aluno:");
     aluno[cont] = x.next();
     for(int cont1 = 0; cont1 < 8; cont1++){
     System.out.println("Digite as respostas do aluno:\nQuestão " +(cont1+1)+": ");
    resposta[cont1]= x.next();
   
 }
     for(int cont2 = 0; cont2<=7; cont2++){
     if(pergunta[cont2].equals(resposta[cont2])){
         Nota[cont] = Nota[cont] + 1.25;
     }
    }
     //Total de alunos aprovados
    if (Nota[cont]>=5){
       aprov = aprov +1;
    }
}
 impressao(aprov);
 //Imprimindo resultado
 for(int cont3 = 0; cont3 < 12;cont3++){
     System.out.println("O Aluno de RA: "+aluno[cont3]+" teve a nota de: "+Nota[cont3]);
 }
    }
    
}
