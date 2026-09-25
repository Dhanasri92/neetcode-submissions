
class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String encoded) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < encoded.length()) {
            int j = i;
            while (encoded.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(encoded.substring(i, j));
            
            String str = encoded.substring(j + 1, j + 1 + length);
            result.add(str);
            
            i = j + 1 + length;
        }
        return result;
    }

}
