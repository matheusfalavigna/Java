package poo;

import java.util.Scanner;

public class Ex1Aul4 {
public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    Pesoideal Aluno = new Pesoideal();
    System.out.println("Altura: ");
    Aluno.setAltura(ent.nextDouble());
    System.out.println("Peso: ");
    Aluno.setPeso(ent.nextDouble());
    System.out.println("Sexo M(Masculino) e F(Feminino): ");
    Aluno.setSexo(ent.next().charAt(0));
    Aluno.CalculaPeso();
    
    }
    
}
