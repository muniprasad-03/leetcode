// Last updated: 04/04/2026, 23:28:43
class Solution {
    public int uniquePaths(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        long mod=1_000_000_007;
        long[][] dpR=new long[m][n];
        long[][] dpD=new long[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                long paths;
                if(i==0&&j==0) {
                    paths=1;
                } else {
                    paths=(dpR[i][j]+dpD[i][j])%mod;
                }
                if(paths==0) {
                    continue;
                }
                if(j+1<n) {
                    int r=i;
                    int c=j+1;
                    boolean isR=true;
                    while(r<m&&c<n&&grid[r][c]==1) {
                        if(isR) {
                            r++;
                            isR=false;
                        } else {
                            c++;
                            isR=true;
                        }
                    }
                    if(r<m&&c<n) {
                        if(isR) {
                            dpR[r][c]=(dpR[r][c]+paths)%mod;
                        } else {
                            dpD[r][c]=(dpD[r][c]+paths)%mod;
                        }
                    }
                }
                if(i+1<m) {
                    int r=i+1;
                    int c=j;
                    boolean isR=false;
                    while(r<m&&c<n&&grid[r][c]==1) {
                        if(isR) {
                            r++;
                            isR=false;
                        } else {
                            c++;
                            isR=true;
                        }
                    }
                    if(r<m&&c<n) {
                        if(isR) {
                            dpR[r][c]=(dpR[r][c]+paths)%mod;
                        } else {
                            dpD[r][c]=(dpD[r][c]+paths)%mod;
                        }
                    }
                }
            }
        }
        long res=(dpR[m-1][n-1]+dpD[m-1][n-1])%mod;
        return (int)res;
    }
}
