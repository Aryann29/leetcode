class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        intervals.append(newInterval)
        intervals.sort(key=lambda x :x[0])
        ans = []
        curr= intervals[0]
        for next in intervals[1:]:
            if curr[1] >=next[0]:
                curr[1] = max(curr[1],next[1])
            else:
                ans.append(curr)
                curr=next
        ans.append(curr)
        return ans