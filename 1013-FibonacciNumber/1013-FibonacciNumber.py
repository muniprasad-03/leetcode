# Last updated: 04/04/2026, 23:32:30
class Solution(object):
    def fib(self, n):
        fiblist = [0,1]
        # 0 1 1 2 3 5 8 13 21 
        for i in range(n-1):
            fiblist.append(fiblist[-1]+fiblist[-2])
        return fiblist[n]


        