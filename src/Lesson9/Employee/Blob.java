
package Lesson9.Employee;


public class Blob {
    private String name;
    private static int blobcount;
    
    public Blob(String x){
        name =x;
        blobcount++;
    }
    
    public String getName(){
        return name;
    }
    
    public static String identify(){//a static method is not an instance method
        return "We    blob fam";
    }
    
    public static int getBlobCount(){ //static variable need to be getted with static method
        return blobcount;
    }
    
    
}
