/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmipocitac;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 

/**
 *
 * @author Jendrisak
 */
public class Kalkulacka {
    
    String Meno;
    float BMI;
    
    public float Pocitadlo(float vaha, float vyska)
    {
        BMI = vaha /(vyska*vyska);
        return BMI;
    }
    
    public void Zapis(String nick)
    {
        File subor = new File("C:\\projekt\\Zoznam.txt");
        
        
        
        
    try {
      FileWriter Zapisovanie = new FileWriter("C:\\projekt\\Zoznam.txt");
      Zapisovanie.write(nick +" " + BMI + "\n");
      Zapisovanie.write("\n");
      Zapisovanie.close();
      
      
    } 
    
    catch (IOException e) {
      System.out.println("Error");
      e.printStackTrace();
    }
       
    }
        
        
      
        
        
        
    }
    

