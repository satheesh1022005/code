public static long arrayManipulation(int n, List<List<Integer>> queries) {
    long[] result = new long[n + 1];

    for (List<Integer> q:queries) {
        int x = q.get(0) - 1;
        int y = q.get(1);
        int z = q.get(2);
        result[x] += z;
        result[y] -= z;
    }

    long max = 0;
    long sum = 0;

    for (long value:result) {
        sum += value;
        max = Math.max(max,sum);
    }

    return max;

    }