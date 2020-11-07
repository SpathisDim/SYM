
package sym;



public class Mathima {
    
    private String onoma;
    private Float vathmos;
    
    public Mathima(){
        onoma="";
        vathmos=null;
    }
    public Mathima(String o,Float v){
        onoma=o;
        vathmos=v;
    }
    public void setOnomaMathimatos(String nameM){
        onoma=nameM;
    }
    public String getOnomaMathimatos(){
        return onoma;
    }
    public Float getvathmosMathimatos(){
        return vathmos;
    }
    
     public String toString(){
         return " - " +getOnomaMathimatos()+" -> "+getvathmosMathimatos();
         
    }
    
    
}
