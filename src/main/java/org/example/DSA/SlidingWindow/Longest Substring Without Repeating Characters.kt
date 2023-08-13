package org.example.DSA.SlidingWindow

import kotlin.math.max

fun main() {
    assert(lengthOfLongestSubstring("abcabcbb") == 3)
    assert(lengthOfLongestSubstring("bbbbbb") == 1)
    assert(lengthOfLongestSubstring("pwwwkew") == 3)
    assert(lengthOfLongestSubstring("aabaab!bb") == 3)
}

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0

    val ss = mutableSetOf<Char>()
    var max = 0
    var l = 0

    s.forEachIndexed { index, c ->
        while (ss.contains(c)) {
            ss.remove(s[l])
            l++
        }
        ss.add(c)

        max = max(max, index - l + 1)
    }

    return max
}