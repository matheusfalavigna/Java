
package poo;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
    String login,senha;
    String senha1 = "java8",login1 = "java8";    
    Scanner ent = new Scanner(System.in);
        for(int i=0;i<3;i++){
        System.out.println("Digite o login:");
        login = ent.nextLine();
        System.out.println("Digite a senha:");
        senha = ent.nextLine();
        
        if(login.equals(login1)){
              
            if(senha.equals(senha1)){
                
            }
            System.out.println("Login e senhas corretos!");
            break;
            }
            else{
                System.out.println("Falha verifique login e senha!");  
            }
          
            System.out.println("Você está na tentativa  : "+(i+1));
            System.out.println("Restante: "+ (2-i));
        }
    }
}
