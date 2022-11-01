package Activity;

import java.util.Scanner;

public class Parser {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String syntax = "<data_type><identifier><assignment_operator><value><delimeter>";
        
        String tokens;
        
        System.out.print("Enter Tokens: ");
        tokens = scan.nextLine();
        
        String check = tokens.replaceAll("\\s", "").toLowerCase();
        
        if(check.equals(syntax)) {
            
            System.out.println("Syntax is Correct!");
            
        }else {
            
            System.out.println("Syntax is Error!");
        }

    }

}
