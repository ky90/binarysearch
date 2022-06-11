
/*
Questions: 
Given a string s, return its run-length encoding. 
You can assume the string to be encoded have no digits and consists solely of alphabetic characters.

Constraints
n ¡Ü 100,000 where n is the length of s

1. 
Input
s = "aaaabbbccdaa"
Output 
"4a3b2c1d2a"

2. 
Input
s = "abcde"
Output
"1a1b1c1d1e"

3. 
Input
s = "aabba"
Output
"2a2b1a"

4. 
Input
s = "aaaaaaaaaa"
Output
"10a"

logic: 
time complexity: o(n) using asci code comparison 
 
Your code took 29 milliseconds ¡ª faster than 48.45% in Java
 */



package binarysearch.easy;

import java.util.*;

public class Q18_Run_Length_Encoding {
	public String solve(String s) {
	        
	        int temp=-1, current=-1, count=0;
	        String str="";
	
	    for(int i=0; i<s.length(); i++){
	       char c=s.charAt(i); 
	       
	       if(i==0){
	          count+=1;  
	          temp=(int)c; 
	          if(s.length()==1){
	            str+=count;
	            str+=c;
	          }
	        }
	        if(i>0){ // i >=1 
	           current=(int)c;
	
	            if(temp==current){
	                    count+=1;
	                    temp=current; 
	                }else{ 
	                    char d=(char)temp;       
	                    str+=count;
	                    str+=d;
	                    count=1; // reset 
	                    temp=current; // reset 
	                }
	        }
	
	    }
	    // to fix the last word do not print out 
	    str+=count; 
	    str+=(char)temp; 
	
	    return str;
	}
	
	public static void main(String[]args) {
		Q18_Run_Length_Encoding obj = new Q18_Run_Length_Encoding();
		
		System.out.println(obj.solve("aaaabbbccdaa")); //4a3b2c1d2a
    	
    	System.out.println(obj.solve("abcde")); // 1a1b1c1d1e
    	
    	System.out.println(obj.solve("aabba")); // 2a2b1a
    	
    	System.out.println(obj.solve("aaaaaaaaaa")); // 10a
    	
	}
}
