package strings;

public class GoalParserInterpretation {
    public String interpret(String command) {
        int len = command.length();
        String ans = "";
        int i=0 ;
        while(i<len){
            if(command.charAt(i) == 'G'){
                ans +="G";
                i++;
            }
            else if(command.charAt(i) == '(' ){
                if(command.charAt(i+1) == ')' ){
                    ans += "o";
                    i+=2;
                }
                else {
                    ans += "al";
                    i+=4;
                }
            }
        }
        return ans;
    }
}
