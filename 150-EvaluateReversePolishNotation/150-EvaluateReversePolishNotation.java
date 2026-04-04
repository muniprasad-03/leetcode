// Last updated: 04/04/2026, 23:36:30
class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        int[] st=new int[n];
        int top=-1;
        for (String token : tokens) {
            if (token.length()==1) {
                char c=token.charAt(0);
                if (c=='+' || c=='-' || c=='*' || c=='/') {
                    int a=st[top--];
                    int b=st[top--];
                    switch (c) {
                        case '+': st[++top]=b+a; break;
                        case '-': st[++top]=b-a; break;
                        case '*': st[++top]=b*a; break;
                        case '/': st[++top]=b/a; break;
                    }
                    continue;
                }
            }
            st[++top]=Integer.parseInt(token);
        }
        return st[top];
    }
}
