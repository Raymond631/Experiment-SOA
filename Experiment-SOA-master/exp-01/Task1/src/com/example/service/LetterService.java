package com.example.service;

import java.util.ArrayList;
import java.util.List;

public class LetterService {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.isEmpty()) return ans;
        String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = digits.charAt(i) - '0';
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < map[x].length(); j++) {
                for (int k = 0; k < ans.size(); k++) {
                    temp.add(ans.get(k) + map[x].charAt(j));
                }
            }
            ans = temp;
        }
        return ans;
    }
}
