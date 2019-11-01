
package Lesson9.shapesv1.monsterexample;


public class HauntedHous {

    
    public static void main(String[] args) {
        Monster m[] = new Monster[4];
        
        for (int i = 0; i < m.length; i++) {
            m[i] = i%2==0? new Zombie("Zombie "+(i+1)): new Vampire("Vampire "+(i+1));
        }
        
        System.out.println("Here come the monsterrssrsr");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].identify());
        }
        //let "x" be each Monster in the Monster array "m"
        System.out.println("attack bith");
        for(Monster x : m){
            x.attack();
        }
    }
    
}
