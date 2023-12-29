 public static List<Integer> 
(int n, List<List<Integer>> queries) {
        List<Integer>[] arr = new ArrayList[n];
        int map[] = new int[n];
        int last = 0, x, y, ch;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (List<Integer> qu : queries) {
            ch = qu.get(0);
            x = qu.get(1);
            y = qu.get(2);

            if (ch == 1) {
                int i = (x ^ last) % n;
                arr[i].add(y);
                map[i]++;
            } else {
                int j = (x ^ last) % n;
                last = arr[j].get(y % map[j]);
                res.add(last);
            }
        }
        return res;
    }