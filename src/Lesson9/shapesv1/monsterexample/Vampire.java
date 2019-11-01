
package Lesson9.shapesv1.monsterexample;


public class Vampire implements Monster{

    private String name;
    
    public Vampire(String n){
        name = n;
    }
    
    @Override
    public void attack() {
        System.out.println("I am giving you neck! -"+name);
    }

    @Override
    public String identify() {
        return("I am "+name+" the vampire.!@@");
    }
    
}
