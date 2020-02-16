/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apspoo;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class APSPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    public class ContaEspecial {
private String nome;
private int cpf,numero;
private double saldo = 0.00;
private double limite = 500.00;
private double quantia;

    public ContaEspecial(int numero) {
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
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
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
               "\nSaldo:"+saldo+
               "\nLimite:"+limite;  
                
    }
    public boolean sacar(double quantia){
        if(this.saldo+quantia>=this.limite){
            return true;
        }
        else{
            return false;
        }
    }
    
}
    }
    
}
    ArrayList<Conta> listaConta = new ArrayList();
    
    public void cadastrarC(Conta c){
        listaConta.add(c);
    }
    public String listarConta(){
        String saida = "";
        if(listaConta.isEmpty()){
            saida = "Nenhuma conta cadastrada";
        }
        else{
            for(Conta c: listaConta){
                saida += c.imprimir()+"\n\n";
            }
        }
        return saida;
    }
    public int buscarConta(int c){
        listaConta.get(c);
        return c;
    }