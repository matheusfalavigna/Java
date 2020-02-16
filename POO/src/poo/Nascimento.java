
package poo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Nascimento {
    private String nome;
    private String cidade;
    private int anon;
    private int dian;
    private int mesn;
    

    public Nascimento() {
    }
    public Nascimento(String nome, String cidade, int anon, int dian, int mesn) {
        this.nome = nome;
        this.cidade = cidade;
        this.anon = anon;
        this.dian = dian;
        this.mesn = mesn;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public int getAnon() {
        return anon;
    }
    public void setAnon(int anon) {
        this.anon = anon;
    }
    public int getDian() {
        return dian;
    }
    public void setDian(int dian) {
        this.dian = dian;
    }
    public int getMesn() {
        return mesn;
    }
    public void setMesn(int mesn) {
        this.mesn = mesn;
    }
    public void calcularIdade(){
    LocalDate data1 = LocalDate.of(getAnon(),getMesn(),getDian());
    LocalDate data2 = LocalDate.now();
    Period period = Period.between( data1 , data2);
    System.out.println("Diferença entre "+data1+" e "+data2);
    System.out.println("Dias: "+period.getDays() );
    System.out.println("Meses: "+period.getMonths() );
    System.out.println("Anos: "+period.getYears() ); 
    }
    public void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Data nascimento: "+getDian()+"-"+getMesn()+"-"+getAnon());
        System.out.println("Data atual: "+ LocalDate.now());
    }
}