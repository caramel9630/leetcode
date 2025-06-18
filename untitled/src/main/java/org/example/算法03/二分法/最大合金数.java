package org.example.算法03.二分法;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class 最大合金数 {
    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost) {
        int minStock = Collections.min(stock);
        Integer[] stockNum = stock.toArray(Integer[]::new);
        Integer[] costNum = cost.toArray(Integer[]::new);
        int ans = 0;
        long money = 0;
        for (List<Integer> comp: composition) {
            Integer[] compNum = comp.toArray(Integer[]::new);
            int left = ans;
            int right = minStock + 1;
            while (left + 1 < right) {
                int mid = (left + right) >>> 1;
                for (int i = 0; i < n; i++) {
                    money += ((long) compNum[i] *mid - stockNum[i])*costNum[i];
                    if (money <= budget) {
                        left = mid;
                    } else {
                        right = mid;
                    }
                }
                ans = left;
            }
        }
        return ans;
    }
}
