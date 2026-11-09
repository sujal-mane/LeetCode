class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<String, Character> mp = new HashMap<>();
        Set<Character> set = new HashSet<>();

        String[] word = s.split(" ");

        if(pattern.length() != word.length) {
            return false;
        }

        for(int i = 0; i < word.length; i++) {

            char ch = pattern.charAt(i);

            if(mp.containsKey(word[i])) {
                if(mp.get(word[i]) != ch) return false;
            }
            else {
                if(set.contains(ch)) return false;

                mp.put(word[i], ch);
                set.add(ch);
            }
        }

        return true;
    }
}