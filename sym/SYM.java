
package sym;

import java.util.Scanner;

/**
 *
 * @author Dimitris
 */

public class SYM{
    
 
    public static void main(String[] args) {
       
       
        int choice=0,choice2=0,choice3=0;
        int proteraiothta_leitourgiwn=0;
        Scanner input=new Scanner(System.in);
        admin a=new admin("Giannis Papagiannis");
        dhlwsh_Summetoxhs dhlwsh1 = new dhlwsh_Summetoxhs(); 
        vathmologia vath=new vathmologia();
        ypeuthinos_Vathmwn v1= new ypeuthinos_Vathmwn();
        YpologismosMoriwn y1=new YpologismosMoriwn();
        
        printMenu();
        do{
            
            System.out.println("--- Πατηστε 1,2,3 για να πραγματοποιησετε συνδεση η 0 για εξοδο ---");
            choice=input.nextInt();
            
            switch(choice){
                case 1:
                    miniMenu();
                    do{
                        choice2=input.nextInt();   
                         switch(choice2){
                            case 1:             //login μαθητη για δημιουργια δηλωσης
                                    dhlwsh1.dhlwsh_mathith(); 
                                                              /*αφου γινει η δηλωση οι μαθητες εξεταζονται και βαθμολογουνται
                                                                στην συνεχεια οι βαθμολογητες παραδιδουν τα γραπτα στους υπευθυνους βαθμων
                                                                οι οποιοι τελικα τα περνανε στο συστημα  */
                                    System.out.println("Πατηστε 0 για ΑΠΟΣΥΝΔΕΣΗ"); 
                                    proteraiothta_leitourgiwn=1;
                            break;
                            case 2:             //login μαθητη για προβολη αποτελεσματων  
                                if(proteraiothta_leitourgiwn == 1){
                                    vath.analutikhVathmologia();    //αναλυτικη βαθμολογια
                                    y1.Ypologismos(vath);         // υπολογισμος μοριων
                                }else{
                                    System.out.println("\n---> ΤΑ ΑΠΟΤΕΛΕΣΜΑΤΑ ΤΩΝ ΠΑΝΕΛΛΑΔΙΚΩΝ ΔΕΝ ΕΧΟΥΝ ΑΝΑΚΟΙΝΩΘΕΙ ΑΚΟΜΑ <---\n");
                                }       
                                System.out.println("Πατηστε 0 για ΑΠΟΣΥΝΔΕΣΗ");
                                break;
                         }
                    }while(choice2!=0);
                    printMenu();
                    System.out.println("****HELP MESSAGE: Τωρα πραγματοποιειται συνδεση ως Yπευθυνος Βαθμων ωστε να περαστουν οι βαθμοι");                  
                    break;
                case 2:    //login  ypeuthinou vathmwn   
                    if(proteraiothta_leitourgiwn != 1){/*προτεραιοτητα λειτουργιων =  για να γινει περασμα βαθμολογιας πρεπει να εχουν παραλαβει τα γραπτα απο τους βαθμολογητες*/
                        System.out.println("\n Warning: Δεν σας εχει ανατεθει ακομα να περασετε βαθμους η δεν εχει τελειωσει η διαδικασια της βαθμολογησης γραπτων ωστε να τα περασετε στο συστημα\n");
                         System.out.println("Help Message: καντε Login ως μαθητης και δημιουργηστε δηλωση\n");
                    }else{
                        v1.apotelesmata_summetexontwn(dhlwsh1,vath);   //περασμα βαθμων               
                       printMenu();
                       System.out.println("****HELP MESSAGE: Οι βαθμοι εχουν περαστει μπορειτε να συνδεθειτε ως μαθητης και να πατησετε Προβολη βαθμολογιας-μοριων");
                    }
                   break;
                case 3:    //login admin
                    System.out.println("========= Admin ===========");
                    System.out.println ("Ονομα admin: "+a.getName());   
                    miniMenu2();
                    do{                       
                        choice3=input.nextInt();   
                         switch(choice3){
                            case 1: 
                                if(proteraiothta_leitourgiwn == 1){
                                    a.sunolikosArithmosDhlwsewn(dhlwsh1);
                                    a.print_Dhlwseis(dhlwsh1);
                                    System.out.println("Πατηστε 0 για ΑΠΟΣΥΝΔΕΣΗ");
                                }
                                else{
                                    System.out.println("\nΔΕΝ ΕΧΟΥΝ ΥΠΟΒΛΗΘΕΙ ΑΚΟΜΑ ΔΗΛΩΣΕΙΣ");
                                    System.out.println("Help Message: καντε Login ως μαθητης και δημιουργηστε δηλωση");
                                    System.out.println("Πατηστε 0 για ΑΠΟΣΥΝΔΕΣΗ");
                                }
                            break;
                            case 2:             
                                if(proteraiothta_leitourgiwn == 1){
                                    a.print_Dhlwseis(dhlwsh1); //τυπωσε τις δηλωσεις
                                    a.delete_Dhlwseis(dhlwsh1);//διαγραφη δηλωσης
                                    System.out.println("Πατηστε 0 για ΑΠΟΣΥΝΔΕΣΗ");
                                }
                                else{
                                    System.out.println("\nΔΕΝ ΕΧΟΥΝ ΥΠΟΒΛΗΘΕΙ ΑΚΟΜΑ ΔΗΛΩΣΕΙΣ");
                                    System.out.println("Help Message: καντε Login ως μαθητης και δημιουργηστε δηλωση");
                                    System.out.println("Πατηστε 0 για ΑΠΟΣΥΝΔΕΣΗ");
                                }
                                    
                                break;
                         }
                    }while(choice3!=0);
                    printMenu();                                                          
                    break;           
            }
        }while(choice!=0);

    }
    public static void printMenu(){
        System.out.println("\n---------------------");
        System.out.println("        LOGIN         ");
        System.out.println("---------------------");
        System.out.println("1. Σαν μαθητης");
        System.out.println("2. Σαν Υπεύθυνος βαθμών");
        System.out.println("3. Σαν διαχειριστής");
        System.out.println("0. EXIT");
    }
     public static void miniMenu(){
        System.out.println("\n----------------------------------------------------");
        System.out.println(" Συνδεθηκατε ως μαθητης επιλεξτε ενα απο τα παρακατω\n ");
        System.out.println("1. Συμπληρωση Δηλωσης για συμμετοχη στις Πανελλαδικες");
        System.out.println("2. Προβολη βαθμολογιας-μοριων");
        System.out.println("0. EXIT");
        System.out.println("------------------------------------------------------");
    }
     public static void miniMenu2(){
        System.out.println("\n----------------------------------------------------");
        System.out.println(" Συνδεθηκατε ως ADMIN επιλεξτε ενα απο τα παρακατω\n ");
        System.out.println("1. Δειτε τις τον συνολικο αριθμο υποβληθεντων δηλωσεων");
        System.out.println("2. Διαχειριση των δηλωσεων");
        System.out.println("0. EXIT");
        System.out.println("------------------------------------------------------");
    }
    
}
