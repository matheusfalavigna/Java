// Dupla: Matheus Falavigna e Gustavo Leite
package poo;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Nascimento d = new Nascimento();
        System.out.println("Digite o nome: ");
        d.setNome(ent.nextLine());
        System.out.println("Digite a cidade em que nasceu: ");
        d.setCidade(ent.nextLine());
        System.out.println("Dia de nascimento: ");
        d.setDian(ent.nextInt());
        System.out.println("Mês de nascimento: ");
        d.setMesn(ent.nextInt());
        System.out.println("Ano de nascimento: ");
        d.setAnon(ent.nextInt());
        d.imprimir();
        d.calcularIdade();
    }
}
