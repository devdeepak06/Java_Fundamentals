//Faculty Keyboard

import java.util.Scanner;

    public class FacultyKeyboard{
        public static boolean isPossible(String name, String typed) {
            // Write your code here
            if(name.length() > typed.length()) return false;
            
            int i = 0;
            int j = 0;
            
            while(i != name.length() && j != typed.length()) {
                if(name.charAt(i) == typed.charAt(j)) {
                    i++;
                    j++;
                } else if(i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                    j++;
                } else {
                    return false;
                }
            }
            
            while(j < typed.length()) {
                if(typed.charAt(j) != name.charAt(i - 1)) return false; 
                j++;
            }
            
            return i < name.length() ? false : true;
        }
    
        // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~
    
        public static void main(String[] args) {
            try (Scanner scn = new Scanner(System.in)) {
                int n=scn.nextInt();
                for(int i=0;i<n;i++){
                    String name = scn.next();
                String typed = scn.next();
   
                boolean res = isPossible(name, typed);
   
                System.out.println(res);
                }
            }
    }
}
