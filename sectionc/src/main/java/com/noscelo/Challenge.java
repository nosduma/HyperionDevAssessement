package com.noscelo;

public class Challenge {
        // THE PROGRAM RUNS ON MAIN PAGE
	public static String isbn13(String str) {
		        if (str.length() != 10 && str.length() != 13) {
            return "Invalid";
        }

        // IF THE LENGTH EQUALS 10 IT WILL RETURN "INVALID"
        int num = 0;
        
        if (str.length() == 10) {
            for (int i = 0; i < str.length(); i++) {
                if (i == str.length() - 1 && str.charAt(i) == 'X') {
                    num += 10;
                } else {
                    num += Character.getNumericValue(str.charAt(i)) * (10 - i);
                }

            }
            // IF THE LENGTH IS DIVISABLE BY 11 IS NOT EQUAL 0 IT WILL RETURN "INVALID"
            if (num % 11 != 0) {
                return "Invalid";
            }

            str = 978 + str;
            num = 0;

            for (int i = 0; i < str.length(); i++) {

                if (i % 2 == 0) {
                    num += Character.getNumericValue(str.charAt(i));

                } else {
                    num += Character.getNumericValue(str.charAt(i)) * 3;
                }
            }
             // IF THE LENGTH IS DIVISABLE BY 10 EQUALS 0 IT WILL RETURN "VALID"
            if (num % 10 == 0) {
                return str;
            } else {
                int left = num % 10;
return str.substring(0, str.length() - 1) + ((10 - left) + Character.getNumericValue(str.charAt(str.length() - 1))) % 10;
            }
        }

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                num += Character.getNumericValue(str.charAt(i));

            } else {
                num += Character.getNumericValue(str.charAt(i)) * 3;
            }
        }

        if (num % 10 == 0) {
            return "Valid";
        }

        return "Invalid";
	}
}
