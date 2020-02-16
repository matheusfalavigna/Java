package apspoo;
public class AppConta {
public static void main(String[] args) {
        java.util.Scanner en = new java.util.Scanner(System.in);
        int tipo=1,tipo2,tipo3,busca;
        double depositar,sacar;
        GerenciarConta n = new GerenciarConta();
       
        
        System.out.println("Conta 1 ou Especial 2");
        switch(tipo){//TIPO DE CONTA
            case 1: 
                Conta C1 = new Conta(); 
                n.adicionarConta(C1);
                
                System.out.println("O que deseja fazer agora RELATORIOS opção 1, MOVIMENTAÇÃO opção 2");
                tipo2 = en.nextInt();
                switch(tipo2){//RELATORIOS E MOVIMENTAÇÃO
                    case 1: System.out.println("você entrou em movimentação\n"+"Agora tem a opção de"
                            + " listar todas as contas digitando 1 ou 2 buscar conta pelo numero");
                            tipo3=en.nextInt();
                            switch(tipo3){//Opções do relatorio
                                case 1: System.out.println("Você escolheu listar todas as contas");
                                n.listarTodos();
                                break;
                                case 2: System.out.println("Você decidiu buscar uma conta especifica");
                                busca =en.nextInt();
                                n.BuscarConta(busca);
                            }
                    break;
                    case 2:System.out.println("Você entrou nas opções de MOVIMENTAÇÃO\n"
                            +"Você pode Efetuar um deposito 1 ou Efetuar um saque 2");
                            tipo3=en.nextInt();
                            switch(tipo3){
                                case 1:System.out.println("Você escolheu fazer um deposito\n"
                                    +"Quanto vai depositar?");
                                    depositar = en.nextDouble();
                                    C1.depositar(depositar);
                                break;
                                case 2:System.out.println("Você escolheu fazer um saque\n"
                                    +"Quanto vai sacar?");
                                    sacar =en.nextDouble();
                                    C1.sacar(sacar);
                                break;
                            }
                    break;
                }
            case 2:
                ContaEspecial CE1 = new ContaEspecial();
                n.adicionarContaEspecial(CE1);
                System.out.println("O que deseja fazer agora RELATORIOS opção 1, MOVIMENTAÇÃO 2");
                tipo2 = en.nextInt();
                switch(tipo2){//RELATORIOS E MOVIMENTAÇÃO
                    case 1: System.out.println("você entrou em movimentação\n"+"Agora tem a opção de"
                            + " listar todas as contas digitando 1 ou 2 buscar conta pelo numero");
                            tipo3=en.nextInt();
                            switch(tipo3){//OPções do relatorio
                                case 1: System.out.println("Você escolheu listar todas as contas");
                                n.listarTodos();
                                break;
                                case 2: System.out.println("Você decidiu buscar uma conta especifica");
                                busca =en.nextInt();
                                n.BuscarContaEspecial(busca);
                            }
                    break;
                    case 2:System.out.println("Você entrou nas opções de MOVIMENTAÇÃO\n"
                            +"Você pode Efetuar um deposito 1 ou Efetuar um saque 2");
                            tipo3=en.nextInt();
                            switch(tipo3){//Tem que alterar
                                case 1:System.out.println("Você escolheu fazer um deposito\n"
                                    +"Quanto vai depositar?");
                                    depositar = en.nextDouble();
                                    CE1.depositar(depositar);
                                break;
                                case 2:System.out.println("Você escolheu fazer um saque\n"
                                    +"Quanto vai sacar?");
                                    sacar =en.nextDouble();
                                    CE1.sacar(sacar);
                                break;
                            }
                    break;
                }
        } 
    } 
}
