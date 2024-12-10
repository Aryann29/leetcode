class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
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
        