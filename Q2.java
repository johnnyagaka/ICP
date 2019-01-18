package Practice;
import java.util.*;

public class Q2 {


      public static void main(String[] args) {
    	  //Allows the user to input the string and it is stored to inputStr variable
    	  System.out.println("Enter the string : ");
    	  Scanner inputStr = new Scanner(System.in);
 
          String string = inputStr.nextLine();
          
           //An array of words is created and the split method separates the characters in the array
          String[] strWords = string.split(" ");
          String reversedString = "";
         
          /*for loop iterated through the split string
           * Stores the words into another string,reversedWords
           */
          
          for(int a = 0; a < strWords.length; a++) {
              String word =strWords[a];
              String reverseWords = "";
 
              for(int i = word.length() - 1; i >= 0; i--) {
            	  reverseWords = reverseWords + word.charAt(i);
              }
              //The reversed words are appended to the reversed string
              reversedString = reversedString + reverseWords + " "; 
   }
          System.out.println("User Input is: "+ string);
 
          System.out.println("Reversed String: "+reversedString);
     }}






