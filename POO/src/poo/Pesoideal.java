package poo;
public class Pesoideal {
   private double peso;
   private double altura;
   private char sexo;
   
   
   public void setSexo(char s){
        this.sexo = s;
    }
    public char getSexo(){
        return this.sexo;
    }
    public void setAltura(double h){
        this.altura = h;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setPeso(double p){
        this.peso = p;
    }
    public double getPeso(){
        return this.peso;
    }
    public void CalculaPeso(){
        double pideal,pseu;
        if(getSexo() == 'M'){
            pideal=(72.7*getAltura()-58);
            pseu =getPeso();
            if(pseu > pideal){
                System.out.println("Acima do peso: "+pseu+"\nO ideal seria: "+pideal);
            }
            else if(pseu == pideal){
                System.out.println("Peso ideal!");
            }
            else{
                System.out.println("Abaixo do peso: "+pseu+"\nO ideal seria: "+pideal);
            }
        }
        else if(getSexo() == 'F'){
            pideal=(62.1*getAltura()-44.7);
            pseu=getPeso();
                if(pseu > pideal){
                    System.out.println("Acima do peso: "+pseu+"\nO ideal seria: "+pideal);
            }
            else if(pseu == pideal){
                System.out.println("Peso ideal!");
            }
            else{
                System.out.println("Abaixo do peso: "+pseu+"\nO ideal seria: "+pideal);
            }
                }
        
        else{
            System.out.println("Erro");
        }
    }
}

   

