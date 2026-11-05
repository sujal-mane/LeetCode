class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character , Integer > mp= new HashMap<>();
        for(char ele : s.toCharArray()){
            if(!mp.containsKey(ele)) mp.put(ele , 1);
            else mp.put(ele , mp.get(ele)+1);
        }
         for(char ele : t.toCharArray()){
            if(!mp.containsKey(ele)) mp.put(ele , 1);
            else mp.put(ele , mp.get(ele)+1);
        }
       for (Character ch : mp.keySet()) {
            if (mp.get(ch) % 2 != 0)
                return ch;
        }

        return ' ';
    }
}