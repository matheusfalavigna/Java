package apspoo;

import java.util.ArrayList;

public class GerenciarConta {
 ArrayList<Conta> listaConta = new ArrayList();
    ArrayList<ContaEspecial> ListaEspecial = new ArrayList();
    String saida ="";
    
    public  void adicionarConta(Conta C){
        listaConta.add(C);
        
    }
    public void adicionarContaEspecial(ContaEspecial CE){
        ListaEspecial.add(CE);
    }
    public void BuscarConta(int C){
        listaConta.get(C);
    }
    public void BuscarContaEspecial(int CE){
        ListaEspecial.get(CE);
    }
     public  String listarTodos(){
        String saida = "";
        if(listaConta.isEmpty() && ListaEspecial.isEmpty()){
            saida = "Nenhum funcionário cadastrado.";
        }
        else{
            for(Conta C: listaConta ){
                saida += C.toString()+"\n\n";
            }
            for(ContaEspecial CE: ListaEspecial){
                saida += CE.toString()+"\n\n";
            }
        }
        return saida;
    }
    
    
    public int buscarConta(int C){
        listaConta.get(C);
        return C;
    }
    }
    



