package Activity;

public class LaboratoryActivityDFA {
   
    public static void main(String[] args) {
        String state1 = "q0";
        String state2 = "q1";
        String finalState = "";
        String input = "00001101100111000011";
        
        for(int x = 0; x<input.length(); x++){
            
            if(state2.equals("q2")&& input.charAt(x) == '1') {
                
                state2 = "q1";
                finalState = "accepted";
                         
            }else if(state1.equals("q0") && input.charAt(x) == '0') {
                      
                state2 = "q2";
                finalState = "not accepted";               
                
            }else if(state1.equals("q0") && input.charAt(x) == '1') {
                                   
                state2 = "q2";
                finalState = "not accepted";
                
            } else {
                
                System.out.println("Invalid input....The result is rejected.");
            }
       }
       
        if(finalState.equals("accepted")){
            System.out.println("String accepted");
        }else{
            System.out.println("String not accepted");
        }
    }
}
