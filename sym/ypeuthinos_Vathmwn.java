
package sym;

/**
 *
 * @author Nhytu
 */
public class ypeuthinos_Vathmwn {
    private String name;
    
    public String getname(){
        return name;
    }
    
    //γινεται περασμα των βαθμων που σημειωσαν οι συμμετεχοντες 
    public void apotelesmata_summetexontwn(dhlwsh_Summetoxhs d ,vathmologia v1){
       
        System.out.println(""
                    + "\n Σας εχει ανατεθει να περασετε στην ηλεκτρονικη πλατφορμα "
                                  + "του Υπουργειου τους βαθμους που σημειωσαν οι παρακατω υποψηφιοι των Παννελλαδικων\n");
        for(Student summetexon:d.summetexontes()){
            
            if(summetexon instanceof summetexontes){
                int id =((summetexontes)summetexon).getID();
                
                System.out.println("- Ονομα: "+summetexon.getName()+"\n"+"- Επιθετο: "+summetexon.getSurname()+"\n"+ 
                                    "- ID Πανελληνιων: "+id);
                System.out.print("- Μαθηματα:");
                for(Mathima ma:d.mathimata_ypopsifiou()){
                    System.out.print(" "+ma.getOnomaMathimatos()+",");             
                 }
                System.out.println("\n------------------------------------------------------------------");
            }
        }
     v1.vathmoi(d);     
    }
}
