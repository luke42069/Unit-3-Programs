
package Lesson8.SamplePrograms;


public class Array2D {

    
    public static void main(String[] args) {
           int nums[][] = {{34,56,67,67},{43,67,78,88},{67,45,45,77}};
           
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 4; j++) {
                   System.out.print(nums[i][j]+" \t ");
               }
               System.out.println("");
        }
           int total = 0;
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 4; j++) {
                   total+=nums[i][j];
               }
        }
           System.out.println("Average: "+total/12);
           add10(nums);
                      for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 4; j++) {
                   System.out.print(nums[i][j]+" \t ");
               }
               System.out.println("");
        }
    }
    
    public static void add10(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]+=10;
            }
        }
    }
    
    
}
