class Solution {
    public int strStr(String haystack, String needle) {
    return Skip(haystack,needle,0);
    }
     public static int Skip(String haystack, String needle, int index) {
        if (haystack.length() < needle.length()) {
            return -1; 
        }

        if (haystack.startsWith(needle)) {
            return index;
        }

        return Skip(haystack.substring(1), needle, index + 1);
    }
    }
