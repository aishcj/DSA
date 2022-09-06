/*
Input: s = "()[]{}"
Output: true


Input: s = "(]"
Output: false
 */
package stack;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public boolean isValid(String s) {
        List<Character> data = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                data.add(s.charAt(i));
            else if(s.charAt(i) == ')'){
                if(data.isEmpty())
                    return false;
                if(data.get(data.size()-1) =='(')
                    data.remove(data.size()-1);
                else
                    return false;
            }
            else if(s.charAt(i) == '}'){
                if(data.isEmpty())
                    return false;
                if(data.get(data.size()-1) =='{')
                    data.remove(data.size()-1);
                else
                    return false;
            }
            else if(s.charAt(i) == ']'){
                if(data.isEmpty())
                    return false;
                if(data.get(data.size()-1) =='[')
                    data.remove(data.size()-1);
                else
                    return false;
            }

        }
        if(data.size() == 0)
            return true;
        else
            return false;
    }
}
