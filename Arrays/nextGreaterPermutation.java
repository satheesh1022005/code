import java.util.*;

public class Solution {
    public static void reverse(List<Integer> al, int i, int j) {
        while (i < j) {
            int temp = al.get(i);
            al.set(i, al.get(j));
            al.set(j, temp);
            i++;
            j--;
        }
    }

    public static List<Integer> nextGreaterPermutation(List<Integer> a) {
        int n = a.size(), index = -1;
        for (int i = n - 1; i > 0; i--) {
            if (a.get(i - 1) < a.get(i)) {
                index = i-1;
                break;
            }
        }
        if (index == -1) {
            reverse(a, 0, n - 1);
            return a;
        }
        for (int i = n - 1; i >=index; i--) {
            if (a.get(i) >=a.get(index)) {
                int temp = a.get(i);
                a.set(i, a.get(index));
                a.set(index, temp);
                break;
            }
        }
        reverse(a, index + 1, n - 1); 
        return a;
    }
}
