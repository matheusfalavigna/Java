
package poo;

public class Baskara {
    double a, b, c;

    public double calcularDelta(){
        return(b*b-4*a*c);
    }
    public double calcularR1(){
        return (-b-Math.sqrt(calcularDelta()))/2*a;
    }
    public double calcularR2(){
        return (-b+Math.sqrt(calcularDelta()))/2*a;
    }
    public String Resultado(){
        double delta = calcularDelta();
        double r1, r2;
        if(a==0){
            return "Não atende os requisitos!";
        }
        else{
            if(delta>0){
                r1 = calcularR1();
                r2 = calcularR2();
                return "Raiz 1: "+r1+
                        "\nRaiz 2: "+r2;
            }
            else if(delta==0){
                r1 = calcularR1();
                return "Raízes são iguais: "+r1;
            }
            else{
                return "Não apresenta raizes!";
            }
        }
    }
        
    }
    

