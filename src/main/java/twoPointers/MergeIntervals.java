package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
        public int[][] merge(int[][] intervals) {
            if (intervals.length == 1) {
                return intervals;
            }

            Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

            List<List<Integer>> items = new ArrayList<>();

            for (int i = 0; i < intervals.length; i++) {
                int start = intervals[i][0];
                int end = intervals[i][1];

                // Use a while loop to merge overlapping intervals
                while (i + 1 < intervals.length && end >= intervals[i + 1][0]) {
                    end = Math.max(end, intervals[i + 1][1]);
                    i++;
                }

                List<Integer> row = new ArrayList<>();
                row.add(start);
                row.add(end);
                items.add(row);
            }

            int[][] result = new int[items.size()][2];
            for (int i = 0; i < items.size(); i++) {
                result[i][0] = items.get(i).get(0);
                result[i][1] = items.get(i).get(1);
            }

            return result;
        }
    }
/*
class Solution {
public int[][] merge(int[][] arr) {
        List<Integer> a=new ArrayList<>();
        Arrays.sort(arr, (c, b) -> Integer.compare(c[0], b[0]));
        a.add(arr[0][0]);
        a.add(arr[0][1]);
        for(int i=1;i<arr.length;i++){
            if(a.get(a.size()-1)<arr[i][0]){
                a.add(arr[i][0]);
                a.add(arr[i][1]);
            }else if(a.get(a.size()-1)<arr[i][1]){
                a.set(a.size()-1,arr[i][1]);
            }
        }
        int ans[][]=new int[a.size()/2][2];
        int k=0;
        for(int i=0;i<ans.length;i++){
            ans[i][0]=a.get(k++);
            ans[i][1]=a.get(k++);
        }
        return ans;
    }

    }
 */
