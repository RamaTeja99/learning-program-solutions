package com.settingup;

public class StringUtilsAssert {
	 public boolean isPalindrome(String str) {
	        if (str == null) return false;
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equalsIgnoreCase(reversed);
	    }

	    public String reverse(String str) {
	        if (str == null) return null;
	        return new StringBuilder(str).reverse().toString();
	    }

	    public int countVowels(String str) {
	        if (str == null) return 0;
	        int count = 0;
	        for (char c : str.toLowerCase().toCharArray()) {
	            if ("aeiou".indexOf(c) != -1) {
	                count++;
	            }
	        }
	        return count;
	    }
}
