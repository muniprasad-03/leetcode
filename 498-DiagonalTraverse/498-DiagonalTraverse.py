# Last updated: 04/04/2026, 23:34:01
class Solution:
    def findDiagonalOrder(self, mat):
        m, n = len(mat), len(mat[0])
        ans = [0] * (m * n)
        row, col = 0, 0
        goingUp = True

        for i in range(m * n):
            ans[i] = mat[row][col]
            if goingUp:
                if col == n - 1:
                    row += 1
                    goingUp = False
                elif row == 0:
                    col += 1
                    goingUp = False
                else:
                    row -= 1
                    col += 1
            else:
                if row == m - 1:
                    col += 1
                    goingUp = True
                elif col == 0:
                    row += 1
                    goingUp = True
                else:
                    row += 1
                    col -= 1

        return ans
