package sym;

public class YpologismosMoriwn {
    
   private boolean[] pedio = new boolean[4];
    private double[] moria = new double[4];    
    
    public void Ypologismos(vathmologia v){
        
        double SB=0,B1=0,B2=0,B3=0,A=0,x=0;
        
        pedio[0]=false; 
        pedio[1]=false; 
        pedio[2]=false;
        pedio[3]=false;
        
        moria[0]=0;
        moria[1]=0;
        moria[2]=0;
        moria[3]=0;
        
        
            
        /*Μεθοδος Υπολογισμου:                        ΒΑΘΜΟΣ    ΣΥΝΤΕΛΕΣΤΗΣ     ΓΙΝΟΜΕΝΟ
        Άθροισμα Βαθμών τεσσάρων μαθημάτων	        SB           2	          2*SΒ
        Βαθμός 1ου μαθήματος αυξημένης βαρύτητας	Β1       1,3 ή 0,9 	 1,3 *Β1
        Βαθμός 2ου μαθήματος αυξημένης βαρύτητας	Β2       0,7 ή 0,4	 0,7 *Β2
        Άθροισμα των γινομένων                                                    A
        Σύνολο Μορίων                                                             100*A
        */
        double SB2=0,C1=0,C2=0;
        
        for(Mathima vath:v.getvathmoi()){
            //Για να βρεθουν τα πεδια που ανοιγουν για τον μαθητη, το πεδιο με τα μορια προκυπτει απο την επιλογη κατευθυνσης και απο την επιλογη του μαθηματος επιλογης
            if(vath.getOnomaMathimatos() == "Λατινικα")
                pedio[0]=true;
            if(vath.getOnomaMathimatos() == "Βιολογια Γενικης")
                pedio[2]=true;
            if(vath.getOnomaMathimatos() == "Μαθηματικα Προσανατολισμου")
                pedio[1]=true;
            if(vath.getOnomaMathimatos() == "Βιολογια Προσανατολισμου")
                pedio[2]=true;
            if(vath.getOnomaMathimatos() == "Α.Ο.Θ.")
                pedio[3]=true;
            
        }
      
            
            for(Mathima vath:v.getvathmoi()){         //Μεσα στη for() παιρνουν τιμη το SB και το B1,B2 και SB2,C1,C2 αν υπαρχει πανω απο ενα πεδιο.
                                                                                
                if(pedio[2]){                                //Αν ανοιγει 3ο πεδιο
                    if(pedio[0] || pedio[1] || pedio[3] ){     //Αν εκτος του 3ου πεδιου, υπαρχει και αλλο (δηλαδη 5 μαθηματα)
                        
                        if(pedio[0]){                     //Περιπτωση με 1ο και 3ο πεδιο ανοιχτο
                            
                            SB += vath.getvathmosMathimatos();
                            SB2 += vath.getvathmosMathimatos();
                            
                            if(vath.getOnomaMathimatos() == "Ιστορία")
                                B2 = 0.7*vath.getvathmosMathimatos();
                            if(vath.getOnomaMathimatos() == "Αρχαία")
                                B1 = 1.3*vath.getvathmosMathimatos();
                            
                            if(vath.getOnomaMathimatos() == "Nεοελληνικη γλωσσα")
                                C2 = 0.4*vath.getvathmosMathimatos();                       
                            if(vath.getOnomaMathimatos() == "Βιολογια Γενικης"){
                                C1 = 0.9*vath.getvathmosMathimatos();
                                SB= SB - vath.getvathmosMathimatos();
                            }
                            
                            if(vath.getOnomaMathimatos() == "Λατινικα")
                                SB2= SB2 - vath.getvathmosMathimatos();             

                            
                        }else if(pedio[1]){                     //Περιπτωση με 2ο και 3ο πεδιο ανοιχτο 
                            
                            SB += vath.getvathmosMathimatos();
                            SB2 += vath.getvathmosMathimatos();
                            
                            if(vath.getOnomaMathimatos() == "Φυσικη")
                                B2 = 0.7*vath.getvathmosMathimatos();
                            if(vath.getOnomaMathimatos() == "Μαθηματικα Προσανατολισμου"){
                                B1 = 1.3*vath.getvathmosMathimatos();
                                SB2= SB2 - vath.getvathmosMathimatos();
                            }
                            
                            if(vath.getOnomaMathimatos() == "Χημεια")
                                C2 = 0.7*vath.getvathmosMathimatos();                       
                            if(vath.getOnomaMathimatos() == "Βιολογια Προσανατολισμου"){
                                C1 = 1.3*vath.getvathmosMathimatos();
                                SB= SB - vath.getvathmosMathimatos();
                            }

                        }else{                                   //Περιπτωση με 4ο και 3ο πεδιο ανοιχτο
                            SB += vath.getvathmosMathimatos();
                            SB2 += vath.getvathmosMathimatos();
                            
                            if(vath.getOnomaMathimatos() == "Α.Ο.Θ."){
                                B2 = 0.7*vath.getvathmosMathimatos();
                                SB2= SB2 - vath.getvathmosMathimatos();
                            }
                            if(vath.getOnomaMathimatos() == "Μαθηματικά")
                                B1 = 1.3*vath.getvathmosMathimatos();
                            
                            if(vath.getOnomaMathimatos() == "Nεοελληνικη γλωσσα")
                                C2 = 0.4*vath.getvathmosMathimatos();                       
                            if(vath.getOnomaMathimatos() == "Βιολογια Γενικης"){
                                C1 = 0.9*vath.getvathmosMathimatos();
                                SB= SB - vath.getvathmosMathimatos();
                            }
                            
                        }
                  
                    }else{                                                //Αν ανοιγει μονο το 3ο πεδιο
                        SB += vath.getvathmosMathimatos();
                        if(vath.getOnomaMathimatos() == "Nεοελληνικη γλωσσα")
                            B2 = 0.4*vath.getvathmosMathimatos();
                        if(vath.getOnomaMathimatos() == "Χημεια")
                            B2 = 0.7*vath.getvathmosMathimatos();
                        
                        if(vath.getOnomaMathimatos() == "Βιολογια Προσανατολισμου")
                            B1 = 1.3*vath.getvathmosMathimatos();
                        if(vath.getOnomaMathimatos() == "Βιολογια Γενικης")
                            B1 = 0.9*vath.getvathmosMathimatos();
                    }
                }else if (pedio[0]){                                     //Αν ανοιγει μονο το 1ο πεδιο
                    SB += vath.getvathmosMathimatos();
                    if(vath.getOnomaMathimatos() == "Ιστορία")
                        B2 = 0.7*vath.getvathmosMathimatos();
                    if(vath.getOnomaMathimatos() == "Αρχαία")
                        B1 = 1.3*vath.getvathmosMathimatos();
                }else if (pedio[1]){                                      //Αν ανοιγει μονο το 2ο πεδιο
                    SB += vath.getvathmosMathimatos();
                    if(vath.getOnomaMathimatos() == "Φυσικη")
                        B2 = 0.7*vath.getvathmosMathimatos();
                    if(vath.getOnomaMathimatos() == "Μαθηματικα Προσανατολισμου")
                        B1 = 1.3*vath.getvathmosMathimatos();
                }else if (pedio[3]){                                      //Αν ανοιγει μονο το 4ο πεδιο
                    SB += vath.getvathmosMathimatos();
                    if(vath.getOnomaMathimatos() == "Α.Ο.Θ.")
                        B2 = 0.7*vath.getvathmosMathimatos();
                    if(vath.getOnomaMathimatos() == "Μαθηματικά")
                        B1 = 1.3*vath.getvathmosMathimatos();
                }
            }

            
        for(int i=0;i<4;i++){                      //Γεμιζει ο πινακας pedio[] και moria[]
            if(pedio[i]){
                if(v.arithmosMathimatwn()==4){        //υπολογισμος μοριων για 4 μαθηματα
                    SB = 2*SB;
                    A= SB + B1 + B2;
                    moria[i]=100*A;
                }else{                         //υπολογισμος μοριων για 5 μαθηματα
                    if(i==2){
                        SB2 = 2*SB2;
                        A= SB2 + C1 + C2;
                        moria[i]=100*A;
                    }else{
                       SB = 2*SB;
                        A= SB + B1 + B2;
                        moria[i]=100*A; 
                    } 
                } 
            }     
        }
        printMoria();   
    }
    
    public void printMoria(){
               //το πεδιο με τα μορια προκυπτει απο την επιλογη κατευθυνσης και απο την επιλογη του μαθηματος επιλογης 
        System.out.println("\n              ΤΑ ΜΟΡΙΑ ΜΟΥ ΑΝΑ ΠΕΔΙΟ               ");
        
        
            System.out.println("\n -> Πεδίο Ανθρωπιστηκων Επιστημών ");
            System.out.print("     Τα μορια σας ειναι : ");
            if(pedio[0]){
                System.out.print(moria[0]);
            }else{
                System.out.print(" -");
            }
        
        
            System.out.println("\n\n -> Πεδίο Θετικων και Τεχνολογικων Επιστημων ");
            System.out.print("     Τα μορια σας ειναι : ");
            if(pedio[1]){
                System.out.print(moria[1]);
            }
            else{
                System.out.print(" -");
            }
        
            System.out.println("\n\n -> Πεδίο Επιστημων Υγείας ");
            System.out.print("     Τα μορια σας ειναι : ");
            if(pedio[2]){
                System.out.print(moria[2]);
            }
            else{
                System.out.print(" -");
            }
            
            System.out.println("\n\n -> Πεδίο Επιστημων Πληροφορικης και Οικονομικων");
            System.out.print("     Τα μορια σας ειναι : ");
            if(pedio[3]){
                System.out.print(moria[3]);
            }
            else{
                System.out.println(" -");
            }
        
            
        System.out.println("\n                 ΣΥΓΧΑΡΗΤΗΡΙΑ                        ");
        System.out.println("=====================================================");
    }

    
    
}
