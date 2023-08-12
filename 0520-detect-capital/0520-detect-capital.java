class Solution {
    public boolean detectCapitalUse(String word) {
        int uc=0,lc=0,n=word.length();
        
         for(int i=0;i<n;i++){

             if(Character.isUpperCase(word.charAt(i))){
                 uc++;
             }
             if(Character.isLowerCase(word.charAt(i))){
                 lc++;
             }

         }
         if(uc==n || lc==n ||(Character.isUpperCase(word.charAt(0)) && lc+1 ==n)) return true;
        
         else return false;
    }
}

