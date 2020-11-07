
package sym;


public class summetexontes extends Student{
    private int id;
    private static int count;
    
    public summetexontes(){
        id=0;
    }
    
    public summetexontes(String n,String s,int ID){
        super(n,s);
        id=ID;
    }
    public void setID(){//id καθε συμμετέχων μαθητη
        id=Increment();
    }
    public int Increment(){
        return  ++count;
    }
    public int getID(){
       return id;
   }
    
       
    
    public String toString(){
        return super.toString()+"  ID υποψηφιου: " +id;
    }
    
}
