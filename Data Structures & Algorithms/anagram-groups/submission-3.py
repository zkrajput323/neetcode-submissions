class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        freq = dict()
        for word in strs:
            sorted_key = "".join(sorted(word))
            if sorted_key in freq:
                 freq[sorted_key].append(word)
            else:
                freq[sorted_key] = [word]
        return list(freq.values())