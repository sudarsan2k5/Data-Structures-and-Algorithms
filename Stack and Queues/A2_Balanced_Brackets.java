import java.util.*;

public class A2_Balanced_Brackets {
    public static boolean handelClosing(Stack<Character> st, char corospondingChar){
        if(st.size() == 0){
            return false;
        }else if(st.peek() != corospondingChar){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char chr = str.charAt(i);
            if(chr == '(' || chr == '{' || chr == '['){
                st.push(chr);
            }else if(chr == ')'){
                boolean val =  handelClosing(st, '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }else if(chr == '}'){
                boolean val = handelClosing(st, '{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }else if(chr == ']'){
                boolean val = handelClosing(st, '[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
        }

        if(st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);;
        }

    }
}
