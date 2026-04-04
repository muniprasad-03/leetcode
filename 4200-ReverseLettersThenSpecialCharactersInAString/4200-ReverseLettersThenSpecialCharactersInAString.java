// Last updated: 04/04/2026, 23:26:31
class Solution {
    public String reverseByType(String s) {
        char[] charArray = s.toCharArray();
        int i = 0, j = s.length()-1, k = 0, l = s.length()-1;
        while(i<j || k<l) {
            if(i<j) {
                if(Character.isLetter(charArray[i])) i++;
                else if(Character.isLetter(charArray[j])) j--;
                else swap(charArray, i++, j--);
            }
            if(k<l) {
                if(!Character.isLetter(charArray[k])) k++;
                else if(!Character.isLetter(charArray[l])) l--;
                else swap(charArray, k++, l--);
            }
        }
        return new String(charArray);
    }
    private void swap(char[] arr, int p1, int p2) {
        char temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}