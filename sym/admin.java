
package sym;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Dimitris
 */

public class admin {
    private int count_dhlwseis; 
    private String aName;
    
    
    public admin(){
        aName="";
    }
    public admin(String onoma){
        aName=onoma;
    }
    public void setName(String a){
        aName=a;
    }
    public String getName(){
        return aName; 
    }
    
    public void sunolikosArithmosDhlwsewn(dhlwsh_Summetoxhs d){//αριθμος υποβληθεντων δηλωσεων
        for(int plithos_Dhlwsewn:d.dhlwseis()){
            count_dhlwseis += plithos_Dhlwsewn;
        }
        System.out.println("\n- Ο συνολικος αριθμων δηλωσεων που εχουν υποβληθει ειναι: "+count_dhlwseis);
    }
 
    public void print_Dhlwseis(dhlwsh_Summetoxhs d){
        System.out.println("\n----------  Διαχειριση Δηλωσεων  -----------");
        for(int number_dhlwshs :d.dhlwseis()){
           System.out.println("  Αριθμος δηλωσης: "+number_dhlwshs+"\n  Αντιστοιχει στην καρτελα:"+d.summetexontes());
           
        }
    }
    public void delete_Dhlwseis(dhlwsh_Summetoxhs d){
        System.out.println("-Διαδικασια ακυρωσης δηλωσης");
        int delete_id;
        Scanner input=new Scanner(System.in);
        System.out.println("Δωσε το ID δηλωσης");
        delete_id=input.nextInt();
        d.akurwsh_Dhlwshs(delete_id);
        System.out.println("Η δηλωση διαγραφηκε");
        }
        
    }

