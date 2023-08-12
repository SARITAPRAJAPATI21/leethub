class Solution {
    public boolean detectCapitalUse(String word) {
        int uc=0;
        int lc=0;
    

         for(int i=0;i<word.length();i++){

             if(Character.isUpperCase(word.charAt(i))){
                 uc++;
             }
             if(Character.isLowerCase(word.charAt(i))){
                 lc++;
             }

         }
         if(uc==word.length() || lc==word.length())
         return true;
         else if(Character.isUpperCase(word.charAt(0)) && lc+1 ==word.length()) 
         return true;
         else 
         return false;
    }
}

