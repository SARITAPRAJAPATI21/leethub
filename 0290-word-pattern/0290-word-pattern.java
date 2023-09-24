class Solution {
    public boolean wordPattern(String pattern, String s) {
      
       String []words=s.split(" ");
       if(words.length !=pattern.length()) return false;

       Map<Character,String> m=new HashMap<>();

      for(int i=0;i<pattern.length();i++){
       

        if(m.containsKey(pattern.charAt(i)) ){
           if( !m.get(pattern.charAt(i)).equals(words[i]))
            return false;
          }
          
         else if (m.containsValue(words[i])) return false ;
          
           m.put(pattern.charAt(i), words[i]);
      }
       return true;

    }
}