/*
Question: 
Given two strings s0 and s1, return whether they are anagrams of each other.

Constraints
n ¡Ü 100,000 where n is the length of s0
m ¡Ü 100,000 where m is the length of s1

1.
Input
s0 = "listen"
s1 = "silent"
Output
true

2. 
Input
s0 = "bedroom"
s1 = "bathroom"
Output
false

Your code took 1601 milliseconds ¡ª faster than 0.09% in Java

*/
package binarysearch.easy;

import java.util.*;

public class Q98_Anagram_Checks {
	public boolean solve(String s0, String s1) {
        int len=s0.length(), len2=s1.length();
        boolean status=false; 
        String str="";
        
        List<String> a = new LinkedList<>();
        List<String> b = new LinkedList<>();   
        if(len!=len2){
            status=false;
        }else{
            for(int i=0, j=0; i<len && j<len2; i++, j++){
                char c=s0.charAt(i);
                char d=s1.charAt(j);
                a.add(String.valueOf(c));
                b.add(String.valueOf(d)); 
            }
            // here logic not beautiful 
            for(int c=0; c<len; c++){
                str=a.get(0); // because of using remove method, then it always get index 0 to calculate 
                //str2=b.get(d);
                //boolean check=a.contains(str); 
                boolean check2=b.contains(str); 
                if(check2){ 
                    a.remove(str);
                    b.remove(str); 
                }else {
                	status=false;
                	break;
                }
            }
            if(a.size()==0 && b.size()==0){
                status=true; 
            }
        }

        return status; 
    }
	
	 public static void main(String[]args)
    {
    	Q98_Anagram_Checks a = new Q98_Anagram_Checks();
    	
    	System.out.println(a.solve("listen", "silent")); // true 

    	System.out.println(a.solve("bedroom", "bathroom")); // false 
    }
}
