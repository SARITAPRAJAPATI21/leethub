class Solution {
    public int strStr(String haystack, String needle) {
       if(needle==" ")
       return -1;
        
      int index=-1;

      for(int i=0;i<haystack.length();i++){

         if(haystack.charAt(i)==needle.charAt(0) && i+needle.length()<=haystack.length() ){

         //  String s1=haystack.substring(i, i+needle.length());
         
          if(haystack.substring(i,i+needle.length()).compareTo(needle)==0){  index=i;   break;  }
          
         }

      }
      return index;

        
    }
}