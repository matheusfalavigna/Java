/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2013,1,1);
LocalDate data2 = LocalDate.now();
Period period = Period.between( data1 , data2);
System.out.println("Diferença entre "+data1+" e "+data2);
System.out.println("Dias: "+period.getDays() );
System.out.println("Meses: "+period.getMonths() );
System.out.println("Anos: "+period.getYears() );
    }
    
}
