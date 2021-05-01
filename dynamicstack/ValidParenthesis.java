package dynamicstack;
import java.util.*;
public class ValidParenthesis {
	
	 public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        for(int i = 0 ; i<s.length(); i++){
	            char c = s.charAt(i);
	            
	            if(c=='('){
	                stack.push(')');
	            }else if(c == '['){
	                stack.push(']');
	            }else if(c == '{'){
	                stack.push('}');
	            }else if(c == ')'&& !stack.isEmpty()){
	                if(stack.pop()!=c){
	                    return false;
	                }
	            }else if(c == ']' && !stack.isEmpty()){
	                if(stack.pop()!=c){
	                    return false;
	                }
	            }else if(c == '}'&& !stack.isEmpty()){
	                if(stack.pop()!=c){
	                    return false;
	                }            }else {
	                return false;
	            }
	            
	        }
	        if(stack.isEmpty()){
	            return true;
	        }
	        return  false;
	    }
	
	 
	 
	 private HashMap<Character, Character> mappings;
	    
	    
	    public ValidParenthesis(){
	        this.mappings = new HashMap<Character, Character>();
	        mappings.put(')','(');
	        mappings.put(']','[');
	        mappings.put('}','{');

	    }
	    
	    
	    public boolean isValid2(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        
	        
	        
	        for(int i = 0 ; i<s.length(); i++){
	            char c = s.charAt(i);
	            if(this.mappings.containsKey(c)){
	                
	                char topElement = stack.empty()? '#':stack.pop();
	                if(topElement != this.mappings.get(c)){
	                    return false;
	                }
	                
	            }else{
	                stack.push(c);
	            }
	            
	        }
	        return stack.isEmpty();
	    }
	 
	 
	 
}
