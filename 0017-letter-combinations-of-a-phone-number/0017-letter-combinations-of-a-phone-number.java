class Solution {
    public List<String> letterCombinations(String digits) {
        try {
            if(digits == null || digits.length() == 0) {
                try {
                    return new ArrayList<>();
                } catch (Exception e) {
                    
                }
            }
            
            Map<Character, String> map = new HashMap<>();
            map.put('2', "abc");
            map.put('3', "def");
            map.put('4', "ghi");
            map.put('5', "jkl");
            map.put('6', "mno");
            map.put('7', "pqrs");
            map.put('8', "tuv");
            map.put('9', "wxyz");
            
            List<String> res = new ArrayList<>();
            dfs(0, digits, new StringBuilder(), res, map);
            return res;
        } catch (Exception e) {
            
            return null; 
        }
    }
    
    private void dfs(int st, String digits, StringBuilder sb, List<String> res, Map<Character, String> map) {
        try {
            if(st == digits.length()) {
                res.add(sb.toString());
                return;
            }
            
            String str = map.get(digits.charAt(st));
            for(int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                dfs(st + 1, digits, sb, res, map);
                sb.setLength(sb.length() - 1);
            }
        } catch (Exception e) {
           
        }
    }
}
