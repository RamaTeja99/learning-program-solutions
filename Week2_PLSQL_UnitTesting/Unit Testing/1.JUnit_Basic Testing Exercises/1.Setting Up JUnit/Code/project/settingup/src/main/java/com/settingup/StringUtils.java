package com.settingup;

public class StringUtils {
	 public boolean isPalindrome(String input) {
	        if (input == null) return false;
	        String reversed = new StringBuilder(input).reverse().toString();
	        return input.equalsIgnoreCase(reversed);
	    }

	    public String toUpper(String input) {
	        return input == null ? null : input.toUpperCase();
	    }
}
