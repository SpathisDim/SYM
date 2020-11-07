/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sym;

/**
 *
 * @author Dimitris
 */


import java.util.ArrayList;
import java.util.Scanner;

public class vathmologia {
    private ArrayList<Mathima> vathmoi;
   
    //Παιρνω τα μαθηματα απο την δηλωση και περναω βαθμους
    public void vathmoi(dhlwsh_Summetoxhs d){
        
      vathmoi=new ArrayList<Mathima>();
      Scanner input = new Scanner(System.in);
      System.out.println("\n=========== Περασμα των τελικων βαθμων του υποψηφιου ============");
      
      for(Mathima ma:d.mathimata_ypopsifiou()){
          System.out.println("Περάστε Βαθμό για "+ma.getOnomaMathimatos()+": ");
          float vathmos=input.nextFloat();
          if(vathmos>=0 && vathmos<=20){
            Mathima m = new Mathima(ma.getOnomaMathimatos(),vathmos);
            vathmoi.add(m);
          }else{
              System.out.println("Try again. Ο βαθμος πρεπει να ειναι απο 0 εως 20");
              vathmos=input.nextFloat();
              Mathima m = new Mathima(ma.getOnomaMathimatos(),vathmos);
                vathmoi.add(m);
          }
      }
      System.out.println("--- Οι βαθμοι που περασατε ----");
      for(Mathima vath:vathmoi){
          System.out.println(vath);
      }
     
    }
    public ArrayList<Mathima> getvathmoi(){
        return vathmoi;
    }
    
    public void analutikhVathmologia(){
      System.out.println("\n============= ΑΠΟΤΕΛΕΣΜΑΤΑ ΠΑΝΕΛΛΑΔΙΚΩΝ =============");
      System.out.println("\n              Αναλυτικη βαθμολογια");
      for(Mathima vath:vathmoi){
          System.out.println(vath);
      }
    }
    
    public int arithmosMathimatwn(){
        int flag=0;
        if(vathmoi.size()==4){
            flag=4;
        }else{
            flag=5;
        }
        return flag;
    }
    
    
}