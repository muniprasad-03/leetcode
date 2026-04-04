// Last updated: 04/04/2026, 23:30:56
class Solution {
public:
    int n;
    void rotate(vector<vector<int>>& mat) {
        // Transpose
        for(int i = 0;i<n;i++) {
            for(int j = i;j<n;j++) {
                swap(mat[i][j], mat[j][i]);
            }
        }
        // Row reverse
        for(int i = 0;i<n;i++) {
            reverse(mat[i].begin(), mat[i].end());
        }
    }
    bool compare(const vector<vector<int>>& mat1, const vector<vector<int>>& mat2) {
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                if(mat1[i][j] != mat2[i][j]) return false;
            }
        }
        return true;
    }
    bool findRotation(vector<vector<int>>& mat, vector<vector<int>>& target) {
        this->n = mat.size();
        for(int i = 0;i<4;i++) {
            if(compare(mat, target)) return true;
            rotate(mat);
        }
        return false;
    }
};