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
        String string1 = "Hello World";
        String string2 = "One two tHRee world";
        String string3 = "vowels are fun";
        String string4 = "intro";
        String string5 = "yellow";
        String string6 = "eEAaUuOoIi";
        System.out.println(capVowelsLowRest(string1));
        System.out.println(capVowelsLowRest(string2));
        System.out.println(capVowelsLowRest(string3));
        System.out.println(capVowelsLowRest(string4));
        System.out.println(capVowelsLowRest(string5));
        System.out.println(capVowelsLowRest(string6));

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
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
