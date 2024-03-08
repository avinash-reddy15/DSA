class Solution {
    static List<List<Character>> list=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        list.add(new ArrayList<>()); // Empty list
        list.add(new ArrayList<>()); // Empty list
        list.add(Arrays.asList('a', 'b', 'c')); // List with characters a, b, and c
        list.add(Arrays.asList('d', 'e', 'f')); // List with characters d, e, and f
        list.add(Arrays.asList('g', 'h', 'i')); // List with characters g, h, and i
        list.add(Arrays.asList('j', 'k', 'l')); // List with characters j, k, and l
        list.add(Arrays.asList('m', 'n', 'o')); // List with characters m, n, and o
        list.add(Arrays.asList('p', 'q', 'r', 's')); // List with characters p, q, r, and s
        list.add(Arrays.asList('t', 'u', 'v')); // List with characters t, u, and v
        list.add(Arrays.asList('w', 'x', 'y', 'z'));
        return func(digits,"");
        
    }
    public List<String> func(String digits, String s) {
        if (digits.isEmpty()) {
            List<String> l = new ArrayList<>();
            if(!s.isEmpty())
            l.add(s);
            return l;
        }
        List<String> l = new ArrayList<>();
        var c = list.get(digits.charAt(0) - '0');
        for (int i = 0; i < c.size(); i++) {
            l.addAll(func(digits.substring(1), s + c.get(i)));
        }
        return l;
    }
}