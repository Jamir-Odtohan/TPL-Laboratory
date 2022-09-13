package Activity;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String text, palindrome,checker = "";         
        
             
        System.out.print("Enter word/phrase: ");
        palindrome=input.nextLine();             
        
        
        //Ignore special character and upperCase
        text=palindrome.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        
       for(int i = text.length()-1;i>=0;i--) {
                     
           checker=checker+text.charAt(i);                   
     
       }
       
       if(text.equals(checker))
            
            System.out.println(palindrome+" is a Palindrome");
                
        else 
               
            System.out.println(palindrome+" is NOT a Palindrome"); 
                 
        
    }
}
