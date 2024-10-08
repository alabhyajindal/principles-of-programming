import java.util.*;

/*
 * Implement the methods marked with a * in the comments below.  
 * 
 * You can test your implementations by calling them from 
 * the main method,
 * 
 * e.g. double[] newArray = exercise.convertIntArray(exampleArray);
 *      m.printArray(newArray);
 */

public class Week5Lesson1 {
  public static void main(String[] args) {
    Week5Lesson1 exercise = new Week5Lesson1();
    exercise.printArray(new double[]{1.3,2.3,3.3,4.3});
    exercise.printArray(new int[]{1,2,3,4});
  }

  // * - method to convert an array of ints to an array of doubles 
  public double[] convertIntArray(int[] array){
    return null;
  }

  // * - method to convert an array of ints to an ArrayList 
  public ArrayList<Integer> convertIntArrayToArrayList(int[] array){
    return null;
  }

  // ---------------------------------------------------
  // helpful methods to print arrays of different types
  // ---------------------------------------------------
  public void printArray(int[] array){
    System.out.print("[");
    for(int i=0; i<array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
  }

  public void printArray(double[] array){
    System.out.print("[");
    for(int i=0; i<array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
  }

  public void printArrayList(ArrayList array){
    System.out.print("[");
    for(int i=0; i<array.size(); i++){
      System.out.print(array.get(i) + " ");
    }
    System.out.println("]");
  }
}
