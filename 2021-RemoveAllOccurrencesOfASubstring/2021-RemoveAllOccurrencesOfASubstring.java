// Last updated: 04/04/2026, 23:30:48
class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int len = part.length();
        int index = sb.indexOf(part);
        while(index!=-1) {
            sb.delete(index,index+len);
            index=sb.indexOf(part);
        }
        return sb.toString();
    }
}