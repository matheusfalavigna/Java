package apspoo;
public class ContaEspecial extends Conta {
private int nConta;
private int limite = 500;

    public ContaEspecial(int nConta, int numero) {
        super(numero);
        this.nConta = nConta;
    }

    public ContaEspecial() {
        super();
    }

    public int getnConta() {
        return nConta;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    @Override
    public String imprimir(){
       return super.imprimir() + "\nLimite: " + this.limite;
   }

    @Override
    public boolean sacar(double quantia){
        if(getSaldo()+quantia>=this.limite){
            super.sacar(quantia);
            return true;
        }
        else{
            super.sacar(quantia);
            return false;
        }
        
    }
    }

