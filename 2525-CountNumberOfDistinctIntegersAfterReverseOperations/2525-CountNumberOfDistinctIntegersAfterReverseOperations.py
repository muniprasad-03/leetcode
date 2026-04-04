# Last updated: 04/04/2026, 23:30:07
class Solution(object):
    def countDistinctIntegers(self, nums):
        distinct_numbers = set()
        for num in nums:
            distinct_numbers.add(num)
            reversed_num = int(str(num)[::-1])
            distinct_numbers.add(reversed_num)
        return len(distinct_numbers)
