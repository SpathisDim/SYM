
package sym;


public class Student {
    
    private String name;
    private String surname;
    
    public Student(){
        name="";
        surname="";       
    }
    public Student(String n,String s){        
        surname=s;
        name=n;
    }

    public void setName(String onoma){
        name=onoma;
    }
    public void setSurname(String epitheto){
        surname=epitheto;
    }
    public String getName(){
       return name;
   }
   public String getSurname(){
       return surname;
   }
    public String toString(){
      return " Όνομα: "+name+ "  Επίθετο: "+surname; 
    }
   
}


    

