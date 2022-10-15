/*
Given two strings first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.

Return an array of all the words third for each occurrence of "first second third".

Example 1:

Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
Output: ["girl","student"]
Example 2:

Input: text = "we will we will rock you", first = "we", second = "will"
Output: ["we","rock"]
*/
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
      String[] t=text.split(" ");
      List<String> list=new ArrayList<>();
        for(int i=0;i<t.length-2;i++)
        {
          if(t[i].equals(first) && t[i+1].equals(second))
          {
            list.add(t[i+2]);
          }
        }
      	return list.stream().toArray(String[]::new);

    }
}
