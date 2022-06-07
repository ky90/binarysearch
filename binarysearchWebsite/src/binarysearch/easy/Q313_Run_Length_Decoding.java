
/*
1. 
Input:
s = "4a3b2c1d2a"
Output:
"aaaabbbccdaa"

2.
Input: 
s="10a4b"
Output: 
"aaaaaaaaaabbbb"

Your code took 27 milliseconds ¡ª faster than 31.23% in Java

*/

package binarysearch.easy;

class Q313_Run_Length_Decoding{
	
    public String solve(String s) {
        int digit=-1;
        String temp="", str="";
        for(int i=0; i<s.length(); i++){    
            char c=s.charAt(i);
             
             // digit 
            if(Character.isDigit(c)){
               temp+=c; 
                if(!Character.isDigit(s.charAt(i+1))){
                    digit=Integer.parseInt(temp);
                    temp=""; // reset 
               }
            }else{
                if(digit!=-1){
                   for(int j=0; j<digit; j++){
                       str+=c;
                   }
                   digit=-1; // reset
                }                
            }
        }
        return str;
    }
    
    public static void main(String[]args)
    {
    	Q313_Run_Length_Decoding a = new Q313_Run_Length_Decoding();
    	
    	System.out.println(a.solve("4a3b2c1d2a")); //aaaabbbccdaa
    	
    	System.out.println(a.solve("10a4b")); // aaaaaaaaaabbbb
    	
    }
}
