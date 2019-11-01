
package Lesson8.SamplePrograms;


public class QuizReview {

    
    public static void main(String[] args) {
        /*
        5 Defs - Parallel arrays, 2D arrays, Ragged array, Physical vs Logical size
        
        Coding: write a method that adds up and returns the total of all numbers in a 2D array
        
        */
        int abc[][]= new int[5][5];
        int total=0;
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc[i].length; j++) {
                total+=abc[i][j];
            }
        }
        
        
        /*
        
        Write a method that counts how many of a certain number are in a 1D array
        
        1 Codingbat (1 of 2) we'll do both today
        */
        
        int nums[][] = new int[4][5];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = i*10+j;
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println("");
        }
        
        System.out.println("The total of all numbers is");
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum+=nums[i][j];
            }
        }
        System.out.println(""+sum);
        System.out.println("\nProgram 2\n");
        int x[]={7,4,8,2,5,5,7,1,4,9,0,8,4,7,2,5,8,4,5,6,1,8,4,7,9};
        int y[] ={7,4,6,27,54,63,2,5};
        
        int numx7=count7(x);
        int numy7=count7(y);
        System.out.format("X has %d 7s and Y got %d.\n",numx7,numy7);
        
        System.out.println("\nCoding Bat Review\n");
        int cb1[]=fizzArray3(11,18);
        System.out.print("[");
        for (int i = 0; i < cb1.length; i++) {
            System.out.print(cb1[i]);
            if(i!=cb1.length-1)
                System.out.print(", ");
        }
        System.out.println("]");
        
        int cb2[]={6,2,5,3};
        cb2=shiftLeft(cb2);
        System.out.print("[");
        for (int i = 0; i < cb2.length; i++) {
            System.out.print(cb2[i]+", ");
        }
    }
    
    public static int count7(int arr[]){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==7)total++;
        }
            return total;
           
    }
    
    public static int[] fizzArray3(int start, int end) {
  int result[] = new int[end-start];
  int index=0;
  for (int i = start; i<end;i++){
    result[index] = i;
    index++;
  }
  return result;
}
/*
    public static int[] shiftLeft(int[] nums) {
  if(nums.length==0)return nums;
  
  int first = nums[0];
  for (int i = 0; i<nums.length-1;i++){
    nums[i] = nums[i+1];
  }
  nums[nums.length-1]=first;
  return nums;
}*/
    /*
    public static int[]fizzArray(int start,int end){
        int fizz[]=new int[end-start];
        int index = 0;
        for (int i = start; i < end; i++) {
            fizz[index]=i;
            index++;
        }
        return fizz;
    }*/
    /*
    public static int[] shiftLeft(int arr[]){
        if (arr.length==0) return arr;
        int first = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        return arr;
    }*/

    
    public static int[] fizzArray(int start,int end){
        int index = 0;
        int fizz[]= new int[end-start];
        for (int i = start; i < end; i++) {
            fizz[index]=i;
            index++;
        }
        return fizz;
    }
    
    public static int[] shiftLeft(int arr[]){
        if (arr.length==0) return arr;
    int first = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        return arr;
}
    
}
