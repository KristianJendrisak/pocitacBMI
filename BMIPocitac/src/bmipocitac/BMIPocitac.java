/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmipocitac;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException; 
import java.io.IOException;


/**
 *
 * @author Jendrisak
 *
 */
public class BMIPocitac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner vstup = new Scanner(System.in);
        Kalkulacka Kalkulacka1 = new Kalkulacka();
        
        System.out.println("Chceš zistiť svoje BMI číslo ? stlač 1");
        System.out.println("Cítiš sa zle ? pozri si výsledok toho pred tebou, stlač 2");
        int volba = vstup.nextInt();
        
        if (volba == 1)
        {
        System.out.println("Ahoj, poď so mnou zistiť ako na tom si :) ");
        
        System.out.println("Napíš mi koľko vážiš(v kilogramoch): ");
        float vaha = vstup.nextFloat();
        System.out.println("A teraz ešte tvoju výšku (v metroch ): ");
        float vyska = vstup.nextFloat();
        System.out.println("Tvoj nick: ");
         String meno = vstup.next();  
        
        
         
        Kalkulacka1.Pocitadlo(vaha, vyska );
       
        System.out.println(meno + " tvoje BMI číslo je " + Kalkulacka1.BMI);
        Kalkulacka1.Zapis(meno);
        
        
        
        
        }
        
        if (volba ==2)
        {
            try 
            {
      File Subor = new File("C:\\projekt\\Zoznam.txt");
      Scanner citacka = new Scanner(Subor);
      while (citacka.hasNextLine()) {
        String data = citacka.nextLine();
        System.out.println(data);
      }
      citacka.close();
      
    } 
            
            catch (IOException e) {
      System.out.println("Error");
      e.printStackTrace();
    }
            
        
        }
        
        
        
        
        
    }
    
}
