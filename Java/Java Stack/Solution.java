import java.util.*;

class Solution {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(checkBalance(input));
        }
        sc.close();
    }

    public static String checkBalance(String input){
        int strlen = input.length();
        if(strlen == 0){
            return "false";
        } else if(strlen%2 == 1){
            return "false";
        } else{
            Stack<Character> stack = new Stack<Character>();
            Map<Character, Character> match = new HashMap<>();
            match.put('{', '}');
            match.put('(', ')');
            match.put('[', ']');
            stack.push(input.charAt(0));
            for (int i = 1; i < input.length(); i++) {
                if (stack.isEmpty()) {
                    stack.push(input.charAt(i));
                } else if(match.get(stack.peek()) == null){
                    return "false";
                } else if (match.get(stack.peek()) == input.charAt(i)) {
                    stack.pop();
                } else{
                    stack.push(input.charAt(i));
                }
            }
            if(stack.isEmpty()){
                return "true";
            } else{
                return "false";
            }
        }
    }
}
