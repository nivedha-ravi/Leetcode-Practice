/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       Map<Character,Integer> hashmap1=new HashMap<>();
       Map<Character,Integer> hashmap2=new HashMap<>();
      for(int i=0;i<ransomNote.length();i++)
      {
        hashmap1.put(ransomNote.charAt(i), hashmap1.containsKey(ransomNote.charAt(i))?(hashmap1.get(ransomNote.charAt(i))+1):1);
      }
      for(int i=0;i<magazine.length();i++)
      {
        hashmap2.put(magazine.charAt(i), hashmap2.containsKey(magazine.charAt(i))?(hashmap2.get(magazine.charAt(i))+1):1);
      }
      for(Map.Entry<Character,Integer> entry:hashmap1.entrySet())
      {
        if(!hashmap2.containsKey(entry.getKey()))
        {
          return false;
        }
        else
        {
          if(hashmap2.get(entry.getKey())<entry.getValue())
          {
            return false;
          }
        }
      }
      return true;
      
    }
}
