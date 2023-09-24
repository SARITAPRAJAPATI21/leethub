class Solution {
    public boolean wordPattern(String pattern, String s) {
      
       String []words=s.split(" ");
       if(words.length !=pattern.length()) return false;

       Map<Character,String> m=new HashMap<>();

      for(int i=0;i<pattern.length();i++){
        char current_char=pattern.charAt(i);//a

        if(m.containsKey(current_char) ){
           if( !m.get(current_char).equals(words[i]))
            return false;
          }
          
         else if (m.containsValue(words[i])) return false ;
          
           m.put(current_char, words[i]);
      }
       return true;

    }
}