package apspoo;
public class Conta {
private String nome;
private int cpf,numero;
private double saldo = 0.00;
private double quantia;

    public Conta() {
    }
    public Conta(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getQuantia() {
        return quantia;
    }
    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }
    public String imprimir(){
        return "Nome:"+nome+
               "\nCPF:"+cpf+
               "\nNúmero:"+numero+
               "\nSaldo:"+saldo;
    }
    public void depositar(double quantia){
        this.saldo += quantia;
    }
    public boolean sacar(double quantia){
        if(this.saldo-quantia>=0){
           return true; 
        }
        else{
           return false;
        }
    }   
}
