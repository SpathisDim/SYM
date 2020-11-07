/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sym;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Dimitris
 */

public class dhlwsh_Summetoxhs  {
    private static int count;
    private int id_dhlwshs;
    private ArrayList<Mathima> mathimata =new ArrayList<Mathima>();
    private ArrayList<summetexontes> summetexontes =new ArrayList<summetexontes>();
    private ArrayList<Integer> id_dhlwsewn ;
    

    public void setID_dhlwshs(){
        id_dhlwshs=Increment();
    }
    public int getID_dhlwshs(){
       return id_dhlwshs;
   }
    public int Increment(){
        return  ++count;
    }
    public String toString(){
        return "ID dhlwshs: " +getID_dhlwshs();
    }

    /*Αρχικα ο μαθητης για την συμμετοχη του στις πανελλαδικες συμπληρωνει μια δηλωση η οποια περιλαμβανει
      ονοματεπωνυμο,κατευθυνση που επιθυμει καθως και μαθηματα που θελει να εξεταστει
    */
    public void dhlwsh_mathith(){
        id_dhlwsewn=new ArrayList<Integer>();
        setID_dhlwshs();
        int id=getID_dhlwshs();
        id_dhlwsewn.add(id);
        
        Scanner input = new Scanner(System.in);
        
        summetexontes s1= new summetexontes();
        System.out.println("\n============= Συμπληρωση Δήλωσης Συμμετοχης ==============\n");
        System.out.println("Δωστε Ονομα: ");
        s1.setName(input.next());
        System.out.println("Δωστε Επιθετο: ");
        s1.setSurname(input.next());
        s1.setID();
        summetexontes.add(s1);// συμμετεχοντες στις πανελλαδικες
        
        System.out.println("\n-Επιλεξτε κατευθυνση:\n 1.Ανθρωπιστικων Σπουδων \n 2.Θετικων Σπουδων\n 3.Σπουδων Οικονομιας και πληροφορικης");
        System.out.println("=====================================\n");
        int kat;
        kat=input.nextInt();
        
        int number;//επιλογη αριθμου μαθηματων επιλογης στα οποια θα εξεταστει
        System.out.println("Επελεξε τον αριθμο των μαθηματων επιλογης που επιθυμεις(απο 1 εως 2)");
        number=input.nextInt();
        Mathima mEpiloghs2 = new Mathima();
        Mathima mEpiloghs1 = new Mathima();
        Mathima m1 = new Mathima();
        Mathima m2 = new Mathima();
        Mathima m3 = new Mathima();

        //επιλογη κατευθυνσης και αντιστοιχων μαθηματων
        int choice;
        switch(kat){
            case 1:
                    System.out.println("\n-Κατευθυνση Ανθρωπιστικων Σπουδων ");

                    m1.setOnomaMathimatos("Nεοελληνικη γλωσσα");
                    m2.setOnomaMathimatos("Αρχαία");
                    m3.setOnomaMathimatos("Ιστορία");

                    mathimata.add(m1);
                    mathimata.add(m2);
                    mathimata.add(m3);

                    //System.out.println("--------------------------------");
                    System.out.println("Διαλέξτε μάθημα επιλογής (1,2,3)");
                    System.out.println("--------------------------------");
                    System.out.println("1. Λατινικα");
                    //System.out.println("2. Μαθηματικα Γενικής");
                    System.out.println("2. Βιολογία Γενικής");
                    System.out.println("--------------------------------");
                    
                    for(int i=0; i<number; i++){   
                        choice=input.nextInt();
                        switch(choice){
                            case 1:
                                 if(i==0){
                                    mEpiloghs1.setOnomaMathimatos("Λατινικα");
                                    mathimata.add(mEpiloghs1);
                                 }else{
                                     mEpiloghs2.setOnomaMathimatos("Λατινικά");
                                     mathimata.add(mEpiloghs2);
                                 }
                                break;
                            case 2:
                                if(i==0){
                                     mEpiloghs1.setOnomaMathimatos("Βιολογια Γενικης");
                                      mathimata.add(mEpiloghs1);
                                }else{
                                     mEpiloghs2.setOnomaMathimatos("Βιολογια Γενικης");
                                     mathimata.add(mEpiloghs2);
                                 }
                                break;

                           }
                    }
                  break;
             case 2:
                        System.out.println("\n-Κατευθυνση Θετικων Σπουδων) ");

                        m1.setOnomaMathimatos("Nεοελληνικη γλωσσα");
                        m2.setOnomaMathimatos("Φυσικη");
                        m3.setOnomaMathimatos("Χημεια");

                        mathimata.add(m1);
                        mathimata.add(m2);
                        mathimata.add(m3);

                        //System.out.println("--------------------------------");
                        System.out.println("Διαλέξτε μάθημα επιλογής (1,2,3)");
                        System.out.println("--------------------------------");
                        System.out.println("1. Μαθηματικα Προσανατολισμου");
                        System.out.println("2. Βιολογια Προσανατολισμου");
                        //System.out.println("3. Ιστορία Γενικής");
                        System.out.println("--------------------------------");
                        for(int i=0; i<number; i++){   
                            choice=input.nextInt();
                            switch(choice){
                                case 1:
                                     if(i==0){
                                        mEpiloghs1.setOnomaMathimatos("Μαθηματικα Προσανατολισμου");
                                         mathimata.add(mEpiloghs1);
                                    }else{
                                         mEpiloghs2.setOnomaMathimatos("Μαθηματικα Προσανατολισμου");
                                         mathimata.add(mEpiloghs2);
                                     }
                                    break;
                                case 2:
                                    if(i==0){
                                        mEpiloghs1.setOnomaMathimatos("Βιολογια Προσανατολισμου");
                                         mathimata.add(mEpiloghs1);
                                     }else{
                                         mEpiloghs2.setOnomaMathimatos("Βιολογια Προσανατολισμου");
                                         mathimata.add(mEpiloghs2);
                                     }
                                    break;

                               }
                    } 
                break;
             case 3:
                            System.out.println("\n-Κατευθυνση Σπουδων Οικονομιας Και Πληροφορικης ");
                            m1.setOnomaMathimatos("Nεοελληνικη γλωσσα");
                            m2.setOnomaMathimatos("Μαθηματικά");
                            m3.setOnomaMathimatos("Α.Ε.Π.");

                            mathimata.add(m1);
                            mathimata.add(m2);
                            mathimata.add(m3);
                            //System.out.println("--------------------------------");
                            System.out.println("Διαλέξτε μάθημα επιλογής (1,2,3)");
                            System.out.println("--------------------------------");
                            System.out.println("1. Α.Ο.Θ.");
                            //System.out.println("2. Ιστορια Γενικής");
                            System.out.println("2. Βιολογία Γενικής");
                            System.out.println("--------------------------------");
                            for(int i=0; i<number; i++){   
                                choice=input.nextInt();
                                switch(choice){
                                    case 1:
                                         if(i==0){
                                            mEpiloghs1.setOnomaMathimatos("Α.Ο.Θ.");
                                             mathimata.add(mEpiloghs1);
                                         }else{
                                             mEpiloghs2.setOnomaMathimatos("Α.Ο.Θ.");
                                             mathimata.add(mEpiloghs2);
                                         }
                                        break;
                                    case 2:
                                        if(i==0){
                                            mEpiloghs1.setOnomaMathimatos("Βιολογια Γενικης");
                                             mathimata.add(mEpiloghs1);
                                        }else{
                                             mEpiloghs2.setOnomaMathimatos("Βιολογια Γενικης");
                                              mathimata.add(mEpiloghs2);
                                         }
                                        break;

                                   }
                    }     
                break;       
        }
        kartela_Symmetoxhs(s1);
    }

    public ArrayList<Mathima> mathimata_ypopsifiou(){
         return mathimata;
    }
    
    public ArrayList<summetexontes> summetexontes(){
         return summetexontes;
    }
    
    public ArrayList<Integer> dhlwseis(){
         return id_dhlwsewn;
    }

    public void kartela_Symmetoxhs(Student s1){
        
                if( s1 instanceof summetexontes){
                    int id =((summetexontes)s1).getID();
                    
                    
                    System.out.println("\n============== Καρτέλα Συμμετοχής ===============");
                    System.out.print(" - Όνομα: "+s1.getName()
                                    +"\n - Επίθετο: "+s1.getSurname()
                                    +"\n - Κωδικος Πανελληνιων: "+id+"\n");
                    System.out.println("\n - Λιστα με τα μαθηματα που επiλεξατε να εξεταστείτε");
                    for(Mathima ma:mathimata){
                        System.out.println("      "+ma.getOnomaMathimatos());
                    }
                    System.out.println("==================================================\n");
                }
    }
    
    public void akurwsh_Dhlwshs(int number){//αριθμος που δινει ο admin
        Iterator<Integer> it = id_dhlwsewn.iterator();
        while(it.hasNext()){
            Integer temp= it.next();
            if(temp.getClass().equals(number)){
                it.remove();                
                break;          
            }
           }
    }
   
}
