// Last updated: 04/04/2026, 23:36:35
class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        vector<int> st;
        st.reserve(tokens.size());
        for (const string& token : tokens) {
            if (token.size()==1 && (token[0]=='+' || token[0]=='-' || 
                                      token[0]=='*' || token[0]=='/')) {
                int a=st.back(); st.pop_back();
                int b=st.back(); st.pop_back();
                switch (token[0]) {
                    case '+': st.push_back(b+a); break;
                    case '-': st.push_back(b-a); break;
                    case '*': st.push_back(b*a); break;
                    case '/': st.push_back(b/a); break;
                }
            } else {
                st.push_back(stoi(token));
            }
        }
        return st.back();
    }
};
