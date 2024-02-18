public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String string1 = "Hello WorLd";
        String string2 = "One two tHRee world";
        String string3 = "vowels are fun";
        String string4 = "intro";
        String string5 = "yellow";
        String string6 = "eEAaUuOoIi";
        printArray(allIndexOf(string1, 'l')); 

    }

    public static String capVowelsLowRest (String string) {
        String vowels = "aAeEiIoOuU"; 
        String ans = "";
        
        for (int i =0; i < string.length(); i++) {
            if (!(string.charAt(i) == ' ')) {
                if ((vowels.indexOf(string.charAt(i)) != -1)) {
                    if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                        ans = ans + (char) ((string.charAt(i)) - 32); 
                    } else {
                        ans = ans + string.charAt(i);
                    }
                } else {
                    if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                        ans = ans + (char) ((string.charAt(i)) + 32) ; 
                    } else {
                        ans = ans + string.charAt(i); 
                    }
                    
                }
                
            } else {
                ans = ans + " "; 
            }
        }
        return ans;
    }

    public static String camelCase (String string) {
        String ans = "";
        boolean isSpace = false; 
        int i = 0; 

        for (i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                break;
            }
        }
        for ( ; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                isSpace = true;
            } else {
                if (isSpace) {
                    isSpace = false;
                    ans += toUpper(string.charAt(i));  
                } else {
                    ans += toLower(string.charAt(i));  
                }
            }
        }
        return ans;     
    }

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
    
        for (int i = 0; i < string.length(); i++) {
            if (chr == string.charAt(i)) {
                counter++; 
            } 
        }

        int [] output = new int[counter];
        int n = 0;

        for (int i = 0; i < string.length(); i++) {
            if (chr == string.charAt(i)) {
                output[n] = i; 
                n++; 
            }
        }
        return output;
    }


    public static char toUpper (char ch){
        if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);
        } 
        return ch; 
    } 

    public static char toLower (char ch){
        if (ch >= 'A' && ch <= 'Z') {
        ch = (char) (ch + 32);
        }
        return ch; 
    }

    public static void printArray(int[] array){
        System.out.print('{');
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            char c = i != array.length - 1 ? ',' : '}';
            System.out.print(c);
         }
        System.out.println();
    }
}
