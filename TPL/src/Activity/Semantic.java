package Activity;

import java.util.Scanner;

public class Semantic {
    
    public static boolean checker(String value, String[] numbers) {
        
        boolean found = false;
        
        for(int i =0; i<numbers.length;i++) {       
            
            if(value.contains(numbers[i])) {
                
                found = true;
                
                break;
                } 
            
        }
        
        return found;
}
    public static void main(String[] args) {
 
        String input="";
        
        Scanner scan = new Scanner(System.in);       
        
        //The expression must contain space (String str = "HelloWorld";)
        
        System.out.print("Enter Expression: ");
        input = scan.nextLine();    
                  
        
        if(input.contains("String")&&input.endsWith(";")) {        
            
            String[] str = input.split(" ");                        
            
            if(str.length ==2) {
                
                System.out.println("Semantically Correct!");                
          
            }else if(str.length > 3) {
                
                String value = str[3].replace(";", "");
                
                if(value.startsWith("\"")&&value.endsWith("\"")) {
                    
                    System.out.println("Semantically Correct!");
                              
                }else {
                    
                    System.out.println("Semantically Incorrect!");
                    
                }
      
            }else {
                
                System.out.println("Semantically Incorrect!");
            }         
            
        }else if(input.contains("int")&&input.endsWith(";")) {
            
            String[] str = input.split(" ");
         
            if(str.length == 2) {
                
                System.out.println("Semantically Correct!");
                
            }else if(str.length > 3){
                
                String value = str[3].replaceAll("[^0-9.]", "");     
                
                Scanner check = new Scanner(value);
                
                if(check.hasNextInt()) {
                    
                    System.out.println("Semantically Correct!");
                
                }else{
                    
                    System.out.println("Semantically Incorrect!");
                                
                }
                             
            }else {
                
                System.out.println("Semantically Incorrect!");
            }         
            
        }else if(input.contains("double")&&input.endsWith(";")) {
            
            String[] str = input.split(" ");                
            
            if(str.length == 2) {
                
                System.out.println("Semantically Correct!");
                
            }else if(str.length > 3) {
                
                String value = str[3].replaceAll("[^0-9.]", "");
                
                Scanner check = new Scanner(value);
                
                if(check.hasNextDouble()) {
                    
                    System.out.println("Semantically Correct!");
                
                }else{
                    
                    System.out.println("Semantically Incorrect!");
                                   
                }
                
            }else {
                
                System.out.println("Semantically Incorrect!");
            }
            
        }else if(input.contains("char")&&input.endsWith(";")) {
               
            String[] str = input.split(" ");
                    
            if(str.length > 1) {
                
                String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                
                String value = str[1].replaceAll("[;]", "");   
                
                if(!checker(value, numbers) == true && value.length()==1) {
                    
                    System.out.println("Semantically Correct!");
                    
                }else {
                    
                    System.out.println("Semantically Incorrect!");
                }
                
            }else{
                
                System.out.println("Semantically Incorrect!");
                                
            }
                
       }else{
           
           System.out.println("Semantically Incorrect!");
                     
       }
           
    }

}
