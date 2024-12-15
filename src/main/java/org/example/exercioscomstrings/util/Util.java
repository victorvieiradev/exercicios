package org.example.exercioscomstrings.util;

public class Util {
    public static Boolean eString(String str) {
        boolean eUmaString = true;
        if (str == null || str.isEmpty()) {
            eUmaString = false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isLetter(str.charAt(i))) {
                    eUmaString = false;
                    break;
                }
            }
        }
        return eUmaString;
    }
}
