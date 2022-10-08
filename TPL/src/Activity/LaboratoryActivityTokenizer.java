package Activity;

import java.util.Scanner;

public class LaboratoryActivityTokenizer {     
    
    public static void checker(String str) {     
        
         String output; 
        
         int count=0;     
         int count2=0;   
         int size=str.length(); 
         
         String[] ch = str.split(" ");        
                 
         for(int x=0;size>x;x++) {                         
             
             output = Character.toString(str.charAt(x));                      
                 
                  if(output.equals(";")&&count==1) {
                     
                     System.out.print("<delimeter>");
                     
                 }else if(output.equals("=")&&count2==2) {
                     
                     System.out.print("<assignment_operator>");
                     count2=3;   
                     
                 }else if(count2==3) {
                         
                         System.out.print("<value>");
                         count2=4;
                     
                 }else if(count2==1) {  
                     
                     valueChecker(ch[1]);
                     count2=2;  
                     
                         
                 }else if(str.contains("String")&&count==0||(str.contains("int")&&count==0||
                         (str.contains("double")&&count==0||(str.contains("char")&&count==0)))) {  
                                                                       
                         if(count(str)>1) {
                      
                             System.out.print("<data_type>");
                             count=1;
                             count2=1;
                             
                         }else{
                             
                             System.out.print("<data_type>");
                             count=1;
                             
                         }
  
                     }
                                                       
                }                 
         }
    
    private static void valueChecker(String str) {
        
        if(str.contains("\"")){
            
            System.out.print("<value>");           
            
        }else {
            
            System.out.print("<identifier>");
            
        }
               
    }
    
    public static int count(String str) {

        int count=0;

        boolean word=false;
        int endOfLine=str.length()-1;
        char[] ch=str.toCharArray();

        for (int i=0;i<ch.length;i++) {
            
           if(Character.isLetter(ch[i]) && i != endOfLine) {
              
              word = true;

          }else if(!Character.isLetter(ch[i]) && word) {
              
              count++;
              word = false;

          }else if(Character.isLetter(ch[i]) && i == endOfLine) {
              
              count++;          
          }
          
        }

        return count;
        
    }
       
    public static void main(String[] args) {                  
         
        String input;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Source Language: ");
        input = scan.nextLine();               
        
        checker(input);
        
    }
     
}
